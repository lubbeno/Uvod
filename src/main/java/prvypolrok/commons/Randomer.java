package prvypolrok.commons;

import java.time.DayOfWeek;
import java.util.Date;
import java.util.Random;

public class Randomer {

    public static void main(String[] args) {


    }



    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }



}
