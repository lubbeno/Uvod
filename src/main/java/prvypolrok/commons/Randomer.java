package prvypolrok.commons;

import java.util.Random;

public class Randomer {

    public static void main(String[] args) {

        int x = 1;
        int y = 3;

        Random random = new Random();
        int z = random.ints(x, y)
                .findFirst()
                .getAsInt();

        System.out.println(z);

        for (int i = 0; i <20 ; i++){
            System.out.println(random.ints(x, y)
                    .findFirst()
                    .getAsInt());

        }
    }



    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

}
