package prvypolrok.tyzden42;

public class VetvenieKoduUlohy {


    public static void main(String[] args) {

        zistiNajvacsieCislo2(1,2,3);
        zistiNajvacsieCislo(2,3,1);
        zistiNajvacsieCislo2(3,2,1);
    }
    public static void zistiNajvacsieCislo(long a, long b, long c) {
        String text = " je najvacsie";

        if (a > b) {
            if (a > c) {
                System.out.println(a + text);
            } else {
                System.out.println(c + text);
            }
        } else {
            if (b > c) {
                System.out.println(b + text);
            } else {
                System.out.println(c + text);
            }

        }
    }


    public static void zistiNajvacsieCislo2(long a, long b, long c) {
        String text = " je najvacsie";

        if (a > b && a > c) {
            System.out.println( a + text);
        }else if( b > a && b > c){
            System.out.println( b + text);
        }
        else {
            System.out.println( c + text);
        }
    }

}
