package prvypolrok.ulohy;

import prvypolrok.projekty.Kalkulacka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class UlohaString {


    public static void main(String[] args) {
        jePalindrom("Lubos");



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
    

   static boolean jePalindrom (String SlovoNaKontrolu){


      for (int x=0;SlovoNaKontrolu.length()>x;x++){
          System.out.println(SlovoNaKontrolu.charAt(x));
      }
String slovo="";
      for( int x = SlovoNaKontrolu.length()-1; x >=0; x--){
         // System.out.println(SlovoNaKontrolu.charAt(x));
         // String slovo ="";
          slovo = slovo + SlovoNaKontrolu.charAt(x);
          System.out.println(slovo);
      }



      return SlovoNaKontrolu == slovo;
     }



}

