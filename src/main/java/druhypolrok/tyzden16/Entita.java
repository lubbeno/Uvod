package druhypolrok.tyzden16;

public class Entita {

    private int vek;
    private String meno;
    private int vyska;


    public Entita(int vek, String meno, int vyska) {
        this.vek = vek;
        this.meno = meno;
        this.vyska = vyska;
        System.out.println("vytvori sa entita");
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public int getVyska() {
        return vyska;
    }

    public void setVyska(int vyska) {
        this.vyska = vyska;
    }
}
