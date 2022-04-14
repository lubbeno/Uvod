package druhypolrok.tyzden15;

import java.util.ArrayList;

public class Opakovanie {
    public static void main(String[] args) {

        TestovaciaTrieda meno = new TestovaciaTrieda();
        System.out.println(meno.toString());
        TestovaciaTrieda test = new TestovaciaTrieda(4,3,"neco");
        //test.neco=8;
        System.out.println(test.toString());
        test.setNeco();
        System.out.println(test.toString());

        System.out.println(test.getMeno());
        System.out.println(test.getDlhe());
        System.out.println(test.getNeco());

        ArrayList<TestovaciaTrieda> mojePole = new ArrayList<>();
        mojePole.add(meno);
        mojePole.add(test);
        for(int i =0;mojePole.size()>i;i++){
            TestovaciaTrieda PatrikovForCyklus = mojePole.get(i);
            System.out.println(PatrikovForCyklus.getMeno());
        }


        for (TestovaciaTrieda PatrikovForCyklus : mojePole) {
            System.out.println(PatrikovForCyklus.getMeno());
        }

    }

}

