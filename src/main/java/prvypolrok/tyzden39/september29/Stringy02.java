package prvypolrok.tyzden39.september29;

public class Stringy02 {

    public static void main(String[] args) {

        String meno = "Lubos";
        String priezvisko ="Sukup";
        String celeMeno = meno + " " + priezvisko;

        celeMeno.indexOf(" ");

        System.out.println(celeMeno.indexOf("u"));
        System.out.println(celeMeno.substring(0,5));
        System.out.println(celeMeno.substring(6, celeMeno.length()));
        System.out.println(celeMeno.substring(6));
        System.out.println(celeMeno.substring(celeMeno.indexOf(priezvisko)));
       int indexPriezviska = celeMeno.indexOf(priezvisko);
        celeMeno.indexOf("Sukup");
        System.out.println(celeMeno.substring(indexPriezviska));
    }
}
