package druhypolrok.tyzden06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UlohaArrayList02 {
        static List<Integer> pole = new ArrayList<>();

    public static void main(String[] args) {
pole.add(2);
        pole.add(1);
        pole.add(6);
        pole.add(3);
        pole.add(-50);

        pridanieDoPola(3);pridanieDoPola(4);
        pridanieDoPola(3);pridanieDoPola(5);pridanieDoPola(2);
        vypisanePola();zorandeniePola();vypisanePola();
    }
    private static void vypisanePola() {
        System.out.println(pole);
    }
    private static void zorandeniePola() {
/*        Comparator<Integer> comp = ( a , b) -> {
            if(a>b)return 1;
            else if( b > a) return -1;
            else return 0;
        };
        pole.sort(comp);*/

        Collections.sort(pole);
    }
    private static void pridanieDoPola(int i) {
        //pridanie do pola len vtedy ak je element unikatny
        // ak je unikatny prida sa do pola a do konzoly vypise: element X pridany
        // ak nie ke unikatny tak sa len vypise do konzoly: element X uz existuje v poli

    }
}
