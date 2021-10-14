package prvypolrok.tyzden41;

// du povrch valca, obsah elipsy, obsah obvod trojuholnika, obvod a obsah 6uholnika

public class UlohyNaOpakovanie {


   public static void main(String... args){
       System.out.println("");
       uloha1();
       System.out.println(" ============================= ");
       uloha2();

       objemValca(4.2,5);
   }


   static void uloha1(){
       System.out.println("toto sa spusti len vtedy ked sa zavola metoda uloha1");
   }

   static void uloha2(){
       int x = 40;
       int y = 23;

       System.out.println("sciatnaie: " + (x + y));
       System.out.println("odcitanie: " + (x- y));
       System.out.println("nasobenie: " + (x*y));
       System.out.println("delenie: " + ((double)x/y));
       System.out.println("modulo: " + (x%y));
   }

   static void objemValca(double polomer, double vyska){
       //double polomer = 4.3;
       double PI = Math.PI;
      // double vyska = 4.5;
       double vysledok = PI*Math.pow(polomer,2)*vyska;

       System.out.println(" objem valca s polomerom " + polomer + " je " + vysledok);

   }


}
