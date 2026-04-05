package electronique;

import java.util.List;

public class CircuitParallele  extends Circuit{
    public final double resistance = 0;

    public CircuitParallele(List<Composant> composant){
        super(composant);
    }

    public double calculerResistance(){

        for (Composant composant : composants()){
            resistance += (1/composant) + calculerResistance();
        }
        double total = 1/resistance;
        return total;
    }
}
