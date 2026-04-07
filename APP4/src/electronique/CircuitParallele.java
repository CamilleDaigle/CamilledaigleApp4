package electronique;

import java.util.List;

public class CircuitParallele  extends Circuit{

    public CircuitParallele(List<Composant> composant){
        super (composant);

    }

    @Override
    public double calculerResistance(){
        double formule = 0;
        double total = 0;

        for (Composant c : this.composant){
            formule += 1/c.calculerResistance();
             total= 1/formule;
        }

        return total;
    }
}
