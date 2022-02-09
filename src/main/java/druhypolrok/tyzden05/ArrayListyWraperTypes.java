package druhypolrok.tyzden05;

import java.util.ArrayList;

public class ArrayListyWraperTypes {

    public static void main(String[] args) {

        ArrayList<Integer> test = new ArrayList<>();

        Integer cislo01 = new Integer(10);
        Integer cislo03 = 3;
        int cislo02 = 6;
         int pokus = cislo01 + cislo02;

    ArrayList<String> poleArrayList = new ArrayList<>();
        System.out.println(poleArrayList.size());
        poleArrayList.add("jedna");
        poleArrayList.add("dva");
        poleArrayList.add("jedna");
        poleArrayList.add("jedna");
        poleArrayList.remove("jedna");
        System.out.println( poleArrayList.toString());


        long i [] = new long[   ]{12};
}
}
