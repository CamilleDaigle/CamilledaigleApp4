package app;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import electronique.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CircuitBuilder {

    private final static char fsep = File.separatorChar;
    private static final String pathIn = System.getProperty("user.dir") + fsep + "APP4" + fsep + "src" + "donnees" +  fsep + "fichier_json" +  fsep;

    public  CircuitBuilder() {
    }

    public Composant construireCircuit (String nomFichier) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode composant = mapper.readTree(new File(pathIn+nomFichier));
            String composantNom = composant.get("nomFichier").asText();
        }
        catch (IOException e) {
            System.out.println("Erreure de lecture: de la liste");
        }
        return
    }

    private Composant lireComposant(JsonNode node){
        String typeCircuit = node.get("type").asText();

        if(typeCircuit == "resistance"){
            return new Resistance(node.get("valeur").asDouble());
        }
        else if(typeCircuit == "serie"){
            List<Composant> composants = new ArrayList<>();
            for (JsonNode composantNode : node.get("composants")) {
                composants.add (lireComposant(composantNode));
            }
            return new CircuitSerie(composants);
        }
        else if(typeCircuit == "parallele"){
            List<Composant> composants = new ArrayList<>();
            for (JsonNode composantNode : node.get("composants")) {
                composants.add (lireComposant(composantNode));
            }
            return new CircuitParallele(composants);
            }
        }
        throw new IllegalArgumentException ("Type de circuit inconnu:" + type);
    }
}
