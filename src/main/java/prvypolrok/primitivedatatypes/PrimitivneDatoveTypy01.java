package prvypolrok.primitivedatatypes;

public class PrimitivneDatoveTypy01 {

    public static void main(String[] args) {


        int den = 10;
        int mesiac = 20;
        int rok = 1234;
        int  vysledok  = den + rok + mesiac;

        long velkeCislo = 3_000_000_000L; //64b
       /* int x; // 32b
        short y; // 16b
        byte z; // 8b
        float f = 5.45f;
        double d = 5.43;*/

        int x = 1;
        int y = 2;

        int z = x++ +(y*x) - --y/2;

        System.out.println(z);


    boolean pravdaNepravda = true;
        boolean pravdaNepravda1 = x > y;

        System.out.println(" mam ho ja vecsie? :" + pravdaNepravda);
    }



}
