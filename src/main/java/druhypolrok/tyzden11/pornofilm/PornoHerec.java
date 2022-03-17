package druhypolrok.tyzden11.pornofilm;

import java.util.ArrayList;
import java.util.List;

public class PornoHerec {

    String menoPriezvisko;
    String pseudonym;
    double dlzkaCiciny;
    double objemVacku;
    double dostrek;
    List<String> filmy = new ArrayList<>();
    final double objemJednehoStriku = 6.0;

    private PornoHerec() {
    }

    public PornoHerec(String menoPriezvisko, String pseudonym, double dlzkaCiciny,
                      double objemVacku, double dostrek) {
        this.menoPriezvisko = menoPriezvisko;
        this.pseudonym = pseudonym;
        this.dlzkaCiciny = dlzkaCiciny;
        this.objemVacku = objemVacku;
        this.dostrek = dostrek;
    }

    public void hraVoFilme(String nazovFilmu){
        filmy.add(nazovFilmu);
        objemVacku = objemVacku - objemJednehoStriku;
    }


    @Override
    public String toString() {
        return "PornoHerec{" +
                "menoPriezvisko='" + menoPriezvisko + '\'' +
                ", pseudonym='" + pseudonym + '\'' +
                ", dlzkaCiciny=" + dlzkaCiciny +
                ", objemVacku=" + objemVacku +
                ", dostrek=" + dostrek +
                ", filmy=" + filmy +
                '}';
    }
}
