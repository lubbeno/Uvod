package prvypolrok.tyzden39.september29;

public class Stringy01 {

    public static void main(String... args) {


        String meno;
        String priezvisko;
        String celeMeno;
        boolean jeVacsi;
        String prazdnyString;

        int nahodneCislo = (int) (Math.random() * 100);

        meno = "Lubos";
        priezvisko = "Sukup";
        celeMeno = meno + " " + priezvisko;
        prazdnyString= "";

        jeVacsi= celeMeno.length() > nahodneCislo;

        System.out.println("dlzka mojho mena je: " + celeMeno.length());
        System.out.println(nahodneCislo);
        System.out.println("je dlzka mojho mena vacsia ako nahodne cislo? " + jeVacsi);


        System.out.println(" prepisee string na velke pismena " + celeMeno.toUpperCase());
        System.out.println("prepise string na male pismena " + celeMeno.toLowerCase()) ;

        System.out.println(celeMeno.isEmpty());


    }


}
