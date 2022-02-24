package druhypolrok.tyzden08;

public class Main {

    public static void main(String[] args) {

        // vytvorili sme si objekt stvoruholnik a ulozili sme si ho do premennej stvoruholnik;
        Stvoruholnik mojStoruholnik = new Stvoruholnik();
        Kruh mojKruh = new Kruh();
        KontrolaPrimitivnychDatovychTypovAString kontrola =
                new KontrolaPrimitivnychDatovychTypovAString();

        Kruh druhyKruh = new Kruh(2.4);
        Stvoruholnik druhyStvoruholnik = new Stvoruholnik(3 ,4 );
        Trojuholnik t1 = new Trojuholnik(2,2,3);
        System.out.println("obsah trouholnika je: "+t1.obsah());


        System.out.println(mojKruh.toString());
        System.out.println(mojStoruholnik.toString());
        System.out.println(kontrola.toString());
        System.out.println(druhyKruh.toString());
    }


}
