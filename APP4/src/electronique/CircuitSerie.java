package electronique;

import java.util.List;

public class CircuitSerie extends Circuit {
    public final double resistance = 0;

    public CircuitSerie(List<Composant> composants) {
        super(composants);
    }

    public double calculerResistance(List<Composant> composants){

        for(Composant composant : composants){
            resistance += composant.calculerResistance();
        }
        return resistance;
    }
}
