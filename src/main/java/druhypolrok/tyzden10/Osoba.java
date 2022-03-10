package druhypolrok.tyzden10;

public class Osoba {

    String meno;
    String priezvisko;
    double vyska;

    public Osoba(){

    }
    public Osoba(String menoConstructor, String priezviskoConstructor, double vyskaConstructor){
        meno = menoConstructor;
        priezvisko = priezviskoConstructor;
        vyska = vyskaConstructor;
    }

    public String uciSaJavu(){
      return meno + " " + priezvisko + " sa brutalne uci Javu";
    }


    @Override
    public String toString() {
        return "Osoba{" +
                "meno='" + meno + '\'' +
                ", priezvisko='" + priezvisko + '\'' +
                ", vyska=" + vyska +
                '}';
    }
}
