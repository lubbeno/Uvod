package prvypolrok.primitivedatatypes;

public class PreteceniePamate {

    public static void main( String... args ){


        int maxCislo = Integer.MAX_VALUE;  //  2_147_483_647

        int superVelkeCilo = maxCislo +1;


        System.out.println(" povodne cislo velke  " + maxCislo);

        // normalne by mal vbyt vysledok 2147483648 ale kedze int ma maximalnu hodnotu dannout velkosi pamate teda 32b
        // tak nie je mozne zapisat do int väčšiu hodnotu ako 2147483647. z tohto dovodu pamät pretetie na zaciatok
        // je to ako tachometer: ked prejdete maximalnu hodnotu na tachometri tak sa vynuluje a ide sa od zaciatku.

        System.out.println(" vysledok: " + (maxCislo +1));

        System.out.println(" vysledok: " + superVelkeCilo);
    }

}
