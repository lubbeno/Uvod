package druhypolrok.tyzden10;

import java.util.ArrayList;

public class TestovaciaTrieda {

    public static void main(String[] args) {

        Osoba defaultnaOsoba = new Osoba();
        Osoba jedna = new Osoba("janko", "hrasko", 150);
        Osoba dva = new Osoba("peto", "mrkvicka", 160);
        Osoba tri = new Osoba("juro", "slivka", 170);

        ArrayList<Osoba> zoznamOsob = new ArrayList<>();
        zoznamOsob.add(defaultnaOsoba);
        zoznamOsob.add(jedna);
        zoznamOsob.add(dva);
        zoznamOsob.add(tri);
        zoznamOsob.add(new Osoba());

        for (Osoba osobaVcykle : zoznamOsob) {
            System.out.println(osobaVcykle.uciSaJavu());
        }

        //System.out.println(defaultnaOsoba);


    }

}
