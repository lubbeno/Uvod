package druhypolrok.tyzden06;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListIterationSortSearch {


    public static void main(String[] args) {

        ArrayList<String> mojePole = new ArrayList<>();
        mojePole.add("janko");
        mojePole.add("patrik");
        mojePole.add("patrika");
        mojePole.add("edo");
        mojePole.add("igor");

       int test = Collections.binarySearch(mojePole,"igor");
       // System.out.println(mojePole.get(test));

        Collections.sort(mojePole);
       // Collections.binarySearch(mojePole,"igor");
        test = Collections.binarySearch(mojePole,"igor");
        System.out.println(mojePole.get(test));

////////////////////////////////////////////////////////////////////////////
/*        for (int i = 0; i < mojePole.size(); i++) {
            System.out.println(mojePole.get(i) + " tu si pridam k elementu nieco");
            System.out.println("iteracia " + i);
            mojePole.remove(3);
            System.out.println("po zmazani elementu " + mojePole);
        }*/

            int y=0;
        for (String s : mojePole) {
            System.out.println(s + " tu si pridam k elementu nieco");
            System.out.println("iteracia " + y++);
            mojePole.remove(3); // je tu chyba nie je mozne upravovat pole
           System.out.println("po zmazani elementu " + mojePole);
        }
    }
}
