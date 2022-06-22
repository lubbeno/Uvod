package druhypolrok.tyzden23;

public class Hamburger {

    private String name;
    private String meat;
    private String breadRollType;
    private double price;

   private String addition1Name, addition2Name,  addition3Name,  addition4Name;
   private double addition1Price, addition2Price, addition3Price, addition4Price;

    public Hamburger(String name, String meat,  double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }
    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double  itemizeHamburger(){
        return price + addition1Price + addition2Price + addition3Price + addition4Price;
    }
}
