package prvypolrok.tyzden39.september29;

public class Stringy02 {

    public static void main(String[] args) {

        String meno = "Lubos";
        String priezvisko ="Sukup";
        String celeMeno = meno + " " + priezvisko;
        int cislo = 0;
        celeMeno.indexOf(" ");

        System.out.println(celeMeno.indexOf("u"));
        System.out.println(celeMeno.substring(0,5));
        System.out.println(celeMeno.substring(6, celeMeno.length()));
        System.out.println(celeMeno.substring(6));
        System.out.println(celeMeno.substring(celeMeno.indexOf(priezvisko)));
       int indexPriezviska = celeMeno.indexOf(priezvisko);
        celeMeno.indexOf("Sukup");
        System.out.println(celeMeno.substring(indexPriezviska));

        System.out.println("================================================");

        char charakter = celeMeno.charAt(4);
        System.out.println(charakter);
        System.out.println(charakter + 1 );

        String novePriezisko = celeMeno.substring(celeMeno.indexOf('S'));
        System.out.print(novePriezisko.charAt(0));
        System.out.print(novePriezisko.charAt(1));
        System.out.print(novePriezisko.charAt(2));
        System.out.print(novePriezisko.charAt(3));
        System.out.println(novePriezisko.charAt(4));

    }
}
