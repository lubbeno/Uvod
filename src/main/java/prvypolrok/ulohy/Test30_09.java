package prvypolrok.ulohy;

public class Test30_09 {

    public static void main(String[] args) {

        int x = 1;
        int y = 2;

        int z = ++x*y++ - y*2;

        int zz = (++y*2 + 1)%3 + x--;
        System.out.println("prve vysledky " + " x=" + x + " y=" +y  + " z=" +z);
        System.out.println("druhe vysledky " + " x=" + x + " y=" +y  + " z=" +zz);

    }

}
