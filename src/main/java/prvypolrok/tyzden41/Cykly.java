package prvypolrok.tyzden41;

public class Cykly {

    public static void main(String[] args) {

        prepisanieNaWhile();
    }

    static void cyklusApole(){

        //inicializacia pola typu int a naplnenie desiatimi cislami
        int[] poleCisiel = new int[]{1,2,3,4,5,6,7,8,9,10};

        int nultyIndex =poleCisiel[0];
        // vypisanie dlzky pola
        System.out.println(poleCisiel.length);
        for (int i = 0; i < poleCisiel.length; i++){
            System.out.println(poleCisiel[i]);
        }
    }

    static void vypisanie10Cisel(){

        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
        }

    }

    static void sucet10Cisel(){
        //int x=0;
        int vysledok = 0;
        for (int i = 1; i <= 10; i++) {
           // System.out.println("pred ulozednim: " +x);
          //  x = i;
          //  System.out.println("po ulozeni: " +x);
            vysledok = vysledok + i;
        }
        System.out.println(vysledok);
    }

     static void prepisanieNaWhile(){

         int i = 1;
         while(i <= 10){
             System.out.println(i);
             i++;
        }
     }

}
