package druhypolrok.tyzden23.printer;

public class Main {
    public static void main(String[] args) {
        Printer p = new Printer(50, false);

        System.out.println(p.printPages(60));
        System.out.println(p.addToner(50));

        System.out.println((Math.round( 11.0/2)));
    }
}
