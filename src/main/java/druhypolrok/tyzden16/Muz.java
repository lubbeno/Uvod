package druhypolrok.tyzden16;

public class Muz extends Entita {



    private final String pohlavie="Muz";

    public Muz(int vek, String meno, int vyska) {
        super(vek, meno, vyska);
    }

    public String getPohlavie() {
        return pohlavie;
    }


    public void zmenimMeno(String muzoveMeno){
        super.setMeno(muzoveMeno);
    }
}
