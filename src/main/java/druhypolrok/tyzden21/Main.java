package druhypolrok.tyzden21;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirsrAndLast(123));

        System.out.println(3 % 10);
    }

    private static int sumFirsrAndLast(int i) {
        int cislo = i;
        int prveCislo = i % 10;
        int posledneCislo = 0;
        while (true) {
            cislo = cislo / 10;
            if ((cislo/10) == 0) {
                posledneCislo = cislo;
                break;
            }

        }
        return posledneCislo + prveCislo;
    }
}
