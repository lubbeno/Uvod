package prvypolrok.ulohy;

import prvypolrok.projekty.Kalkulacka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class UlohaString {


    public static void main(String[] args) {
        osemPoli();
    }
   static String text = " Clovek mierou svojeho chápania pracuje na seba, " +
                            "a mierou nechápania na tých, kto chápe viac";

  static   void test2(){

        int pocet=0;
      for (int i = 0; i < text.length(); i++) {
         // System.out.println(text.charAt(i));
            if(text.charAt(i) ==' '){
                pocet = pocet + 1;
            }

      }

      System.out.println(pocet);

      System.out.println(text.chars().filter( a ->  a==' ').count());
    }


    static   void osemPoli(){


        int[] test = new int[] {2,5,66,77,898,34,2433,5676,367,-653};
        int vysledok1 = Arrays.binarySearch(test,367);
        System.out.println(vysledok1);

        Arrays.sort(test);
        vysledok1 = Arrays.binarySearch(test,367);
        System.out.println(vysledok1);


        System.out.println(Arrays.toString(test));


    }
    

}

