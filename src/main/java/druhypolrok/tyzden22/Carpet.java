package druhypolrok.tyzden22;

public class Carpet {
    double cost;
    public Carpet(double cena){
        // cost = cena <0 ? 0 : cena;
        if (cena < 0){
            cost = 0;
        }
        else{
            cost = cena;
        }
    }
    public double getCost(){
        return cost;
    }

}
