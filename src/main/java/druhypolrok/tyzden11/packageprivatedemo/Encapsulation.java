package druhypolrok.tyzden11.packageprivatedemo;

import druhypolrok.tyzden11.pornofilm.PornoHerec;

import java.util.ArrayList;
import java.util.List;

public class Encapsulation {

    public static void main(String[] args) {

        PornoHerec jarko = new PornoHerec("Jaro Slavik", "Hulibrk"
                ,19,9,100);
        PornoHerec ferko = new PornoHerec("Fero Vrana", "Mahojakotyc"
                ,21,7,93);

        List<PornoHerec> pornoherci = new ArrayList<>();
        pornoherci.add(jarko);
        pornoherci.add(ferko);

        for (PornoHerec phc: pornoherci) {
            System.out.println( "dlzka ciciny " + phc.menoPriezvisko + " je " + phc.dlzkaCiciny);
        }

        jarko.pseudonym = "nic";
       // jarko.objemVacku = -39;
        jarko.setObjemVacku(-39);
        jarko.menoPriezvisko = "trtko";
        for (PornoHerec phc: pornoherci) {
            System.out.println( "dlzka ciciny " + phc.menoPriezvisko + " je " + phc.dlzkaCiciny);
        }
    }
}
