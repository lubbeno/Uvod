package druhypolrok.tyzden16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Muz muz1 = new Muz(13,"Jano1", 189);
        Muz muz2 = new Muz(16,"Jano2", 189);
        Muz muz3 = new Muz(18,"Jano3", 189);
        Muz muz4 = new Muz(21,"Jano4", 189);
        Muz muz5 = new Muz(54,"Jano5", 189);

        Zena zena1 = new Zena(12, "Edita1",155);
        Zena zena2 = new Zena(13, "Edita2",155);
        Zena zena3 = new Zena(15, "Edita3",155);
        Zena zena4 = new Zena(16, "Edita4",155);
        Zena zena5 = new Zena(17, "Edita5",155);


        List<Zena> zeny = Arrays.asList(zena1, zena2, zena3, zena4, zena5);
        List<Muz> muzi = new ArrayList<>();
        muzi.add(muz1);
        muzi.add(muz2);
        muzi.add(muz3);
        muzi.add(muz4);
        muzi.add(muz5);

        // uloha: vytvorte si 5 objektov typu Muz a 5 objektov typu zena.
        // vyvtorte si polia pre muzov a pre zeny.
        // potom vypiste mena vsetkych muzov co maju viac ako 18 rokov.
        // dalej vypiste mena vsetkych zien co maju viac ako 15 rokov.


    List<Entita> celyZoznam = new ArrayList<>();
        celyZoznam.addAll(zeny);
        celyZoznam.addAll(muzi);

        for (Entita a : celyZoznam) {
            a.pohyb();
        }



    }
}
