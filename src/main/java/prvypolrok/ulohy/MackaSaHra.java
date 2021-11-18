package prvypolrok.ulohy;

import javax.xml.bind.SchemaOutputResolver;

public class MackaSaHra {

    public static void main(String[] args) {

        mackaSaHra(true, 54);

    }

    private static void mackaSaHra(boolean b, int i) {

        if (b) {
            if (i > 25) {
                if (i < 45) {
                    System.out.println("macka sa hra");
                } else {
                    System.out.println("macka sa nehra");
                }
            } else {
                System.out.println("macka sa nehra");
            }

        } else {
            if (i > 25) {
                if (i < 35) {
                    System.out.println("macka sa hra");
                } else {
                    System.out.println("macka sa nehra");
                }
            } else {
                System.out.println("macka sa nehra");
            }
        }
    }


    private static void mackaSaHra2(boolean b, int i) {
        if (b) {
            if (i > 25 & i < 45) {
                System.out.println("macka sa hra");
            } else {
                System.out.println("macka sa nehra");
            }
        } else {
            if (i > 25 & i < 35) {
                System.out.println("macka sa hra");
            } else {
                System.out.println("macka sa nehra");
            }
        }

    }
}


