package druhypolrok.tyzden11.pornofilm;

import java.util.ArrayList;
import java.util.List;
// rodicovska trieda
public class Herec {

    private String menoPriezvisko;
    private String pseudonym;
    List<String> filmy = new ArrayList<>();

    public Herec(){}

    public Herec(String menoPriezvisko, String pseudonym) {
        this.menoPriezvisko = menoPriezvisko;
        this.pseudonym = pseudonym;

    }


    public String getMenoPriezvisko(){ return menoPriezvisko;}
    public String getPseudonym() {
        return pseudonym;
    }
    public void setMenoPriezvisko(String menoPriezvisko) {
        this.menoPriezvisko = menoPriezvisko;
    }
    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }


    public void pridatFilm(String nazovFilmu){


    }

     public boolean odobratFilm(String nazovFilmu){
        // zistite najprv ci sa film nachadza v zozname
         // pokial sa film zmaze zo zoznamu navratova hodnota je true
         // inak false.
       return false;
     }

}
