package electronique;

import java.util.ArrayList;
import java.util.List;

public abstract class Circuit extends Composant{

    public ArrayList<Composant> composant;

    public Circuit(ArrayList<Composant> composants){
        this.composant = composants;
    }
}
