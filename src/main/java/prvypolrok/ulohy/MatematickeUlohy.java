package prvypolrok.ulohy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MatematickeUlohy {

    public static void main(String[] args) {

        int vysledok =0;
        // 1, 46, 4, 34, 5, 76, 44, 34, 5, 6, 6, 77,9,81,74,4 ,41,21,11,2,3,9,0,88,54,32,990,1258,2,4745,295

        // uloha: sucet cisiel takych ktore su parne a ich odmocnina je mensia ako 4
        //omodcnnia Math.
            int[] test = new  int[]{1, 46, 4, 34, 5, 76, 44, 34, 5, 6, 6, 77,9,81,74,4 ,41,21,11,2,3,9,0,88,54,32,990,1258,2,4745,295};
            System.out.println(Arrays.stream(test)
                    .filter(a -> a %2 ==0 )
                    .filter(a -> Math.sqrt(a) < 4)
                    .sum());

    }

}
