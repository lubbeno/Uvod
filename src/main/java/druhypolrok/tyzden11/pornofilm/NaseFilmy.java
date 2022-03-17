package druhypolrok.tyzden11.pornofilm;

import java.util.ArrayList;
import java.util.List;

public class NaseFilmy {

    public static void main(String[] args) {

        PornoHerec jarko = new PornoHerec("Jaro Slavik", "Hulibrk"
                ,19,9,100);
        PornoHerec ferko = new PornoHerec("Fero Vrana", "Mahojakotyc"
                ,21,7,93);

        PornoHerecka evka = new PornoHerecka(" Jane Doe",
                "HmmMlask",50.6,21);
        PornoHerecka erzika = new PornoHerecka(" Jane Boo",
                "huhucoctail",2.1,19);


        List<PornoHerec> pornoherci = new ArrayList<>();
            pornoherci.add(jarko);
            pornoherci.add(ferko);
        List<PornoHerecka> pornoherecky = new ArrayList<>();
            pornoherecky.add(evka);
            pornoherecky.add(erzika);

        for (PornoHerec phc: pornoherci) {
            System.out.println( "dlzka ciciny " + phc.menoPriezvisko + " je " + phc.dlzkaCiciny);
        }

        for (PornoHerecka pornoHerecka : pornoherecky) {
            System.out.println("hlbka chacharuse " + pornoHerecka.menoPriezvisko
                    + " je " + pornoHerecka.hlbkaChacharuse);
        }
       // System.out.println( "dlzka ciciny " + jarko.menoPriezvisko + " je " + jarko.dlzkaCiciny);

    }
}
