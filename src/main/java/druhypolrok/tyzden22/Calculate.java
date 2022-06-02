package druhypolrok.tyzden22;

public class Calculate {
    private Floor floor;
    private Carpet carpet;

    public Calculate(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return floor.getArea()* carpet.getCost();
    }
}
