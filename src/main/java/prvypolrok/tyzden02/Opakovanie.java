package prvypolrok.tyzden02;

import java.util.Arrays;

public class Opakovanie {

    public static void main(String[] args) {
        ulohy1_11();

        int[] t = {12,8,0,7,54} ;
        int[] t1 = new int[]{12,8,0,7,54};
        maxCislo(t);
        System.out.println(maxCislo(t));
    }

    public static void ulohy1_11(){
        String meno = "Lubos";

        for(int x =0; x<meno.length(); x++){
            char ch = meno.charAt(x);
            System.out.println(ch);
        }

        char[] menoPole = meno.toCharArray();
        char[] poleCharakterov = new char[]{'L','u','b','o','s'};
        boolean[] y = new boolean[]{};
        //y[0] = true; java.lang.ArrayIndexOutOfBoundsException: 0
        boolean[] y1 = new boolean[5];
        y1[0] = true;
        System.out.println(Arrays.toString(y1));
     /*   for (int i = 0; i < poleCharakterov.length; i++) {
            System.out.println(poleCharakterov[i]);
        }*/
        boolean[] more = new boolean[5];
        char[] nerob = new char[5];
        int[] nevim = new int[5];
        String[] nevim2 = new String[5];
        System.out.println(Arrays.toString(more));
        System.out.println(Arrays.toString(nerob));
        System.out.println(Arrays.toString(nevim));
        System.out.println(Arrays.toString(nevim2));

        System.out.println(more.toString());
        System.out.println(nerob.toString());
    }

    public static int maxCislo(int[] i){
        int max = 0;
        for (int x=0; x<i.length;x++){
            if(i[x]>max){
                max=i[x];
            }
        }
        return max;
    }

    public static String parnaNeparna(int[] i){
        int parne = 0;
        int neparne =0;
        for (int x=0; x<i.length;x++){
            if(i[x]%2 == 0){
                parne = parne +1;
                // alebo parne++;
            }else{
                neparne = neparne +1;
            }
        }
        return "Parne cisla: "+ parne + "Neparne cisla: " + neparne;
    }
    public static String parnaNeparna2(int[] i){
       long parne = Arrays.stream(i).filter(a -> a%2==0).count();
        return "Parne cisla: "+ parne + "Neparne cisla: " + (i.length-parne);
    }
}
