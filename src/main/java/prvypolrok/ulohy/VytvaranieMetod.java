package prvypolrok.ulohy;

public class VytvaranieMetod {

    // uloha vytvorte metody s nazvom medoda1 - 10
    // prima 1 parameter int a nevracia ziadnu hodnotu
    // prima 2 parameter int a String a vracia String
    // prima 3 parameter boolean String, int a vracia String
    // prima 0 parameter  a vracia long
    // prima 1 parameter pole int a vracia pole String
    // prima 2 parameter pole boolean a int a nevracia ziadnu hodnotu
    // prima 3 parameter String , long a char  vracia boolean
    // prima 1 parameter float a vracia float
    // prima 0 parameter  a vracia pole boolean
    // prima 1 parameter boolean a nevracia ziadnu hodnotu

       static void metoda1(int a){
        }
         static boolean metoda100(int a){
                return false;
     }

 /*   Vytvor premene s nazvami pocnuc a :
    int
    boolean
    long
    String
    float
    double
    char

    vytvot polia kazde pole bude obashovat 5 elementov a naplnte ho elementami podla uvazenia
    pole int
    pole String
    pole char
    pole boolean
    pole float
    pole long
    */


static void premenne(){

     int[] ints = new  int[]{1,555,5,5,55,5};

     for ( int x =0; ; x++) {
               int temp = ints[x];
        System.out.println( "element pola int: " + temp);
     }
}





}
