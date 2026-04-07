package electronique;

import java.util.List;

public abstract class Circuit extends Composant{

    public List<Composant> composant;

    public Circuit(List<Composant> composants){
        this.composant = composants;
    }
}
