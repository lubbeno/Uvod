package prvypolrok.ulohy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class UD1 {
    public static void main(String[] args) {
        int[]  pole = new int[]{1,46,4,34,5,76,44,34,5,6,6,77,};
        //priemer(pole);

        vypis();
        //vypisDva();
    }
    static double priemer(int[] poleCisiel){

       return  Arrays.stream(poleCisiel).sum()/poleCisiel.length;
    }


    static void  vypis(){
        boolean test = true;
        for (int i = 0; i<5; i++){
            System.out.println(test);
          test = !test;

        }
    }


    static void vypisDva(){

        for (int x =1; x<=5; x++){

            if(x%2==0){
                System.out.println(true);
            }else {
                System.out.println(false);
            }
        }
    }
}
