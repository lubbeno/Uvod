package druhypolrok.tyzden22;

public class Main {

    // vytvorime si objekt Calculate s tym je spojene vytvorenie objektov Floor a Carpet.
    // potom zavolame metoud calculate a zobrazime cenu koberca

    public static void main(String[] args) {

        Floor s = new Floor(10,8);
        Carpet w = new Carpet(5);
        Calculate e = new Calculate(new Floor(10,8),new Carpet(5));
        Calculate v = new Calculate(s,w);
        System.out.println("Cena koberca je: "+v.getTotalCost());
        System.out.println("Cena koberca je: "+e.getTotalCost());



    }
}
