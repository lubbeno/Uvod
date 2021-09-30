package prvypolrok.primitivedatatypes;

public class Stringy {

    public static void main(String[] args) {

        String mojeMeno = "Lubos Sukup";

        String privlastok = " sa hra na ";

        String ucitel = "ucitela";

        System.out.println(mojeMeno + privlastok + ucitel);

        System.out.println("========================================================");

        int cisloJedna = 32;

        String cisloDva = "32";

        int cisloTri = 32;


        System.out.println( cisloJedna + cisloDva);

        System.out.println(cisloJedna + cisloTri + cisloDva);

        System.out.println(cisloDva + cisloTri + cisloJedna);

        System.out.println(cisloDva + (cisloTri + cisloJedna));

    }
}
