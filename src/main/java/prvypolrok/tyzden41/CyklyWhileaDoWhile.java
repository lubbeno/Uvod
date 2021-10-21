package prvypolrok.tyzden41;

public class CyklyWhileaDoWhile {

    static int spolocneI = 1;

    public static void main(String[] args) {
        ukazkaWhile("Lubos");
        System.out.println("========================================");
        ukazkaDoWhile("Lubos");
    }

    public static void ukazkaWhile(String meno) {
        int i = spolocneI;
        // nekoneckna slucka while (true) {
        while (i < 11) {
            System.out.println(i + " " + meno);
            i++;
        }
    }

    public static void ukazkaDoWhile(String meno) {
        int i = spolocneI;
        do{
           System.out.println(i + " " + meno);
            i++;
        }while (i < 11);


    }
}
