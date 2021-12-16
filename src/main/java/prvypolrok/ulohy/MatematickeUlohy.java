package prvypolrok.ulohy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MatematickeUlohy {

    public static void main(String[] args) {

        nic(new int[]{2,5,56,6,5});

        int vysledok =0;
        // vypisat z pola elementy indexa 1;11;20;41;53;68
            int[] test = new  int[]{1, 46, 4, 34, 5, 76, 44, 34, 5, 6, 6, 77,9,81,74,4 ,41,21,11,2,3,9,0,88,54,32,990,1258,2,4745,295};
            System.out.println(Arrays.stream(test)
                    .filter(a -> a %2 ==0 )
                    .filter(a -> Math.sqrt(a) < 4)
                    .sum());

    }

        static void nic(int[] pole){

        }


}
