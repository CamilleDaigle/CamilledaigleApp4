package electronique;

import java.util.ArrayList;
import java.util.List;

public class CircuitSerie extends Circuit {

    public CircuitSerie(ArrayList<Composant> composants) {
        super(composants);
    }

    @Override
    public double calculerResistance(){
        double formule = 0;

        for (Composant c : this.composant){
            formule+= c.calculerResistance();
        }

        return formule;
    }
}
