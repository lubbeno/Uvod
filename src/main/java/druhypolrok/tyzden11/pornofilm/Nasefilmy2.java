package druhypolrok.tyzden11.pornofilm;

import java.util.ArrayList;
import java.util.List;

import static druhypolrok.tyzden11.pornofilm.Commons.pornoHerci;
import static druhypolrok.tyzden11.pornofilm.Commons.pornoHerecky;

public class Nasefilmy2 {

    public static void main(String[] args) {

        PornoHerecka pornoHerecka = pornoHerecky().get(0);
        ArrayList<PornoHerec> herci = (ArrayList) pornoHerci();
        herci.forEach( ph -> System.out.println(ph.getObjemVacku()));

        pornoHerecka.robiGangbang(herci);

        herci.forEach( ph -> System.out.println(ph.getObjemVacku()));

    }

    private static void getObjemVacku(){
        pornoHerci().forEach( ph -> System.out.println(ph.getObjemVacku()));

    }
}
