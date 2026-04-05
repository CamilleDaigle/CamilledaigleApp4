package electronique;

public class Resistance extends Composant{
    public  double resistance;
    public Resistance(double resistance) {

    }

    public double getResistance() {
        return resistance;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }

    public double calculerResistance(){
        return resistance;
    }
}
