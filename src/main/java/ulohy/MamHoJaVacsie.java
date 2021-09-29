package ulohy;

public class MamHoJaVacsie {

    public static void main(String[] args) {

        int ja = 10 * 4 * 1985;
        int sused = 1;

        boolean jeMojeVacsie = ja > sused;

        String vysledok;

        if (jeMojeVacsie) {
            vysledok = "Ano";
        } else {
            vysledok = "Nie";
        }
        System.out.println(" mam ho ja vecsie? :" + vysledok);
    }

}
