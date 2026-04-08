package app;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import electronique.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CircuitBuilder {

    private final static char fsep = File.separatorChar;
    private static final String pathIn = System.getProperty("user.dir")+ fsep + "APP4" + fsep + "src" + fsep + "donnees" + fsep + "fichiers_json" + fsep;

    public CircuitBuilder() {
    }

    public Composant construireCircuit (String nomFichier) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode racine = mapper.readTree(new File(pathIn+nomFichier));
            JsonNode composant = racine.get("circuit");
            return  lireComposant(composant);
        }
        catch (IOException e) {
            System.out.println("Erreure de lecture de la liste");
            return null;
        }
    }

    private Composant lireComposant(JsonNode node){
        String typeCircuit = node.get("type").asText();

        if(Objects.equals(typeCircuit, "resistance")){
            return new Resistance(node.get("valeur").asDouble());
        }
        else if(Objects.equals(typeCircuit, "serie")){
            ArrayList<Composant> composants = new ArrayList<>();
            for (JsonNode composantNode : node.get("composants")) {
                composants.add (lireComposant(composantNode));
            }
            return new CircuitSerie(composants);
        }
        else if(Objects.equals(typeCircuit, "parallele")){
            ArrayList<Composant> composants = new ArrayList<>();
            for (JsonNode composantNode : node.get("composants")) {
                composants.add (lireComposant(composantNode));
            }
            return new CircuitParallele(composants);
            }
        throw new IllegalArgumentException ("Type de circuit inconnu:" + typeCircuit);
    }
}
