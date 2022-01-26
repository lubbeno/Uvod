package druhypolrok.tyzden04;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrrayListy {


    public static void main(String[] args) {
        listy();
    }
    void polia() {

        int[] pol1 = {1, 1, 2, 2, 23, 4};
        int[] pole2 = new int[]{1, 2, 23, 3};

        int elemement = pol1[2];
        pol1[2] = 5000;
        System.out.println(Arrays.toString(pol1));
        Arrays.sort(pol1);
       boolean rovnajusa = Arrays.equals(pol1,pole2);



    }

    static void listy(){


        ArrayList<String> poleArrayList = new ArrayList<>();
        System.out.println(poleArrayList.size());
        poleArrayList.add("jedna");
        poleArrayList.add("dva");
        poleArrayList.add("jedna");
        poleArrayList.add("jedna");
        poleArrayList.remove("jedna");
        System.out.println( poleArrayList.toString());


        int[] pole2 = new int[]{};
        System.out.println(pole2.length);
    }


}
