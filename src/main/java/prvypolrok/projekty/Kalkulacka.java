package prvypolrok.projekty;

public class Kalkulacka {


    public static void main(String[] args) {
        scitanie(3,5);
        odcitanie( 7, 1);
        nasobenie( 5, odcitanie(4, 6));
    }


   static double scitanie(double a , double b){

      double c =a +b;
       System.out.println(c);
      return c;

    }

  static  double odcitanie(double a, double b){
        double c =a -b;
        System.out.println(c);
return c;
    }

    double delenie(double a, double b){
        double c;
        if(b == 0 ){
            System.out.println("tak mame problem");
            c = 0;
            return  c;
        }else {
             c = a / b;
            return c;
        }
    }

    static void nasobenie(double a, double b){


    }
}
