package druhypolrok.tyzden04;

import java.util.ArrayList;
import java.lang.*;

public class UlohaArrayList {



   static ArrayList<String> testovaciePole = new ArrayList<>();

    public static void main(String[] args) {

      pridanie(testovaciePole,"prvy Zaznam");
        System.out.println(testovaciePole);
        zmenaElementu(testovaciePole,0,"druhy zaznam");
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
            //int velkostPola =pole.size();
            // vrati text so znenim "Velkost pola je: XXXXX "
        return "Velkost pola je: " +pole.size();
    }

    public static String zmenaElementu(ArrayList<String> pole, int index, String element){
        // set sa pouzije ale najprv treba skontorlovat ci dany index patri do rozmedzia daneho
        // pola. ak bude vecsii vypisete "chybny index mimo rozsahu pola" ak to bude ok:
        // " vlozeny XXXXXX na index xxx "
        if (pole.size() > index){
            pole.set(index,element);
            return "Vlozeny"+element+"na index"+index;
        }
        else{
            return "chybny index mimo rozsahu pola";
        }

    }

    public static void vymazatPole(ArrayList<String> pole){

        pole.clear();
        // pouzi clear()

    }

    public static String obsahujeElement(ArrayList<String> pole, String element){

        boolean x = pole.contains(element);
        String y = "";
        if(x){
           y= ("pole obsahuje element: " + element);
        }else{
            y= ("pole neobsahuje element: " + element);
        }
        return y;

        // vrati text " pole obsahuje elelent : XXXXXX" a ked nie  " pole Neobsahuje elelent : XXXXXX"
    }

    public static String obsahujeElement02(ArrayList<String> pole, String element){
        if(pole.contains(element)){
           return  ("pole obsahuje element: " + element);
        }else{
            return  ("pole neobsahuje element: " + element);
        }
        // vrati text " pole obsahuje elelent : XXXXXX" a ked nie  " pole Neobsahuje elelent : XXXXXX"
    }
}


