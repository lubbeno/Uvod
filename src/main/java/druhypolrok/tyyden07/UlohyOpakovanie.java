package druhypolrok.tyyden07;

import java.util.Arrays;
import java.util.List;

public class UlohyOpakovanie {
    public static void main(String[] args) {
    List<Integer> pole01 = Arrays.asList(1,5,3,6,4,3,4,6,3,6);
        List<Integer> pole02 = Arrays.asList(0,0,0,0,30,0,0,0,0,0);
        List<Integer> pole03 = Arrays.asList(15,0,0,0,0,15,0,0,0,0,0);
        List<Integer> pole04 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> pole05 = Arrays.asList(1,5,3,6,4,3,8,9,3,6);
        List<Integer> pole06 = Arrays.asList(1,5,0,6,0,3,4,6,11,6);
        System.out.println(kontorla30(pole01));
        System.out.println(kontorla30(pole02));
        System.out.println(kontorla30(pole03));
        System.out.println(kontorla30(pole04));
        System.out.println(kontorla30(pole05));
        System.out.println(kontorla30(pole06));


    }
    /*
        Napiste metodu ktora kontoroluje sucet vsetkyc desiatich hodnuot ci je presne 30.
        vrati true ak ano ak ine false.
        */
    static boolean kontorla30(List<Integer> pole){
        System.out.println(pole.stream().count());
        if (pole.size()==10){
            int sucet=0;
            for(int i: pole){
                sucet = sucet+i;
            }
            if(sucet==30){
                return true;
            }
            else{
                return false;
            }
        }
        else {return false;}
}

/*
 Napiste metodu ktora najde sucet dvoch elementov daneho pola ktorych vysledok bude
 rovny danemu cislu
 */
    public static void sucetDvochelementov(List<Integer> pole, int dannySucet){

    }
/*
 z daneho pola vyberiete len parne cisla a druha metoda z daneho vyberiete len
 neparne cisla
 */
   static List<Integer> neparneCisla(List<Integer> pole){

    }
   static List<Integer> parneCisla(List<Integer> pole){

    }
}
