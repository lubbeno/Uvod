package druhypolrok.tyzden04;

import java.util.ArrayList;
import java.lang.*;

public class UlohaArrayList {



   static ArrayList<String> testovaciePole = new ArrayList<>();

    public static void main(String[] args) {

      pridanie(testovaciePole,"prvy Zaznam");
        System.out.println(testovaciePole);
        
    }

    public static void pridanie(ArrayList<String> pole, String stringNaPridanie){
        pole.add(stringNaPridanie);
    }

    public static boolean jePrazdnePole1(ArrayList<String> pole){


        return true;
    }

    public static String jePrazdnePole2(ArrayList<String> pole){
        // aby na miesto true alebo false pot text :  nie je tam nic" alebo " obsahuje elementy"

return "";
    }

    public static String velkostPola(ArrayList<String> pole){

        // vrati text so znenim "Velkost pola je: XXXXX "
        return "";
    }

    public static String vlozenieElementu(ArrayList<String> pole, int index, String element){
        // set sa pouzije ale najprv treba skontorlovat ci dany index patri do rozmedzia daneho
        // pola. ak bude vecsii vypisete "chybny index mimo rozsahu pola" ak to bude ok:
        // " vlozeny XXXXXX na index xxx "
        return "";
    }

    public static void vymazatPole(ArrayList<String> pole){
        // pouzi clear()

    }

    public static String obsahujeElement(ArrayList<String> pole, String element){

        // vrati text " pole obsahuje elelent : XXXXXX" a ked nie  " pole Neobsahuje elelent : XXXXXX"
    }
}
