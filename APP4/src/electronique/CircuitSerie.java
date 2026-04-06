package electronique;

import java.util.List;

public class CircuitSerie extends Circuit {

    public CircuitSerie(List<Composant> composants) {
        super(composants);
        for(Composant composant : composants){
           calculerResistance(composant);
        }
    }

    public double calculerResistance(List<Composant> composants){

        double formule = 0;
        formule+= composants.calculerResistance();
        return formule;
    }
}
