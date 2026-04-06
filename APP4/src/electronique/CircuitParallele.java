package electronique;

import java.util.List;

public class CircuitParallele  extends Circuit{

    public CircuitParallele(List<Composant> composant){
        super(composant);
        for (Composant composant : composants()){
           calculerResistance(composant);
        }
    }

    public double calculerResistance(List<Composant> composants){

        double formule =0;
        formule += (1/composants) + calculerResistance();
        double total = 1/formule;
        return total;
    }
}
