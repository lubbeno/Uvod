package prvypolrok;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Test {

    public static void main(String[] args) {
        int[] myArray = IntStream.rangeClosed(0,100).toArray();
            printOut(myArray);
            uloha();
    }

    static void printOut(int[] a){

        System.out.println(Arrays.toString(mixArray(a)));
    }

    static int[] mixArray(int[] array){

        for (int i = 0; i < array.length; i++) {
            int random = new Random().nextInt(array.length);
                    int temp = array[i];
                 array[i] = array[random];
                    array[random] = temp;
        }

        return array;
    }

    static void uloha() {

       int x = 3;
       int z = 1;
       for (int i =0; i<3; i++){
           if(x%2 ==0) {
               z++;
               x--;
           }else {
               x = x*2;
               z++;
           }
       }

        System.out.println( x + " " + z);
    }
}
