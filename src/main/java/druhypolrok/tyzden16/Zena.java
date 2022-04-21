package druhypolrok.tyzden16;

public class Zena extends Entita{

    private final String pohlavie="Zena";

    public Zena(int vek, String meno, int vyska){
        super(vek,meno,vyska);
        System.out.println("vytvori sa zena");
    }

    public String getPohlavie() {
        return pohlavie;
    }

}
