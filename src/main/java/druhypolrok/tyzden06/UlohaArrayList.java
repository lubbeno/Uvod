package druhypolrok.tyzden06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UlohaArrayList {

    // vytvor ArrayList a pole[] na vsetky primitivne datove typy

    public static void main(String[] args) {




        Boolean[] myBoolean01 = new Boolean[]{false,true,false};

        System.out.println("Zle " + myBoolean01.toString());


        System.out.println("Dobre " + Arrays.toString(myBoolean01));

        List<Boolean> test01 = Arrays.asList(true,false,true);
           // test01.add(true);
        System.out.println(test01);
        List<Boolean> test02 = Arrays.asList(myBoolean01);

        System.out.println(test02);

    }

    static void polia(){

        boolean[] myBoolean01 = new boolean[]{false,true,false};
        ArrayList<Boolean> myBoolean02 = new ArrayList<>();
        myBoolean02.add(false);
        myBoolean02.add(true);
        myBoolean02.add(false);







    }

}

