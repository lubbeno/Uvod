package druhypolrok.tyzden11.pornofilm;

import java.util.ArrayList;
import java.util.List;

public class PornoHerecka {

    String menoPriezvisko;
    String pseudonym;
    double dostrik;
    double hlbkaChacharuse;
    List<String> filmy = new ArrayList<>();

    private PornoHerecka() {
    }

    public PornoHerecka(String menoPriezvisko, String pseudonym,
                        double dostrik, double hlbkaChacharuse) {
        this.menoPriezvisko = menoPriezvisko;
        this.pseudonym = pseudonym;
        this.dostrik = dostrik;
        this.hlbkaChacharuse = hlbkaChacharuse;
    }

    public void hraVoFilme(String nazovFilmu){
        filmy.add(nazovFilmu);
    }

    @Override
    public String toString() {
        return "PornoHerecka{" +
                "menoPriezvisko='" + menoPriezvisko + '\'' +
                ", pseudonym='" + pseudonym + '\'' +
                ", dostrik=" + dostrik +
                ", hlbkaChacharuse=" + hlbkaChacharuse +
                '}';
    }
}
