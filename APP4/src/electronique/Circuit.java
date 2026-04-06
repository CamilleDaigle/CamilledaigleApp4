package electronique;

import java.util.List;

public abstract class Circuit extends Composant{
    public Circuit(List<Composant> composants){
        super(composants);
    }

    protected List<Composant> composants(){
        for (Composant() comp : composants()){
            if(comp == CircuitParallele){
                CircuitParallele(comp());
            }
            if (comp == CircuitSerie){
                CircuitSerie(comp());
            }
        }
        return composants();
    }

}
