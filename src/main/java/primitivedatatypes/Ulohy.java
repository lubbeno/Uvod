package primitivedatatypes;

// https://java.meritcampus.com/core-java-questions/Hikes-and-Hikes
// https://javaconceptoftheday.com/quiz-on-increment-and-decrement-operators/
public class Ulohy {

    //uloha 1
    {
        int a = 34;
        int b = 21;
        int c = a++ + ++b;
        int d = --a + --b + c--;
        int e = a + +b + +c + d--;
        int f = -a + b-- + -c - d++;
        int sum = a + b + c + d + e + f;
        System.out.println("sum = " + sum);
    }

    // uloha 2
    {
        int i = 4;
        int j = 21;

        int k = ++i * 7 + 2 - j--;

        System.out.println("k = " + k);
    }

    // uloha 3
    {

        int a = 1;
        int b = 2;
        int c;
        int d;

        c = ++b;
        d = a++;

        c++;

        System.out.println("a = " + a);
        System.out.print("b = " + b);
        System.out.println("c = " + c);
        System.out.print("d = " + d);
    }

    // uloha 4
    {
        int input = 7;
        int output = ++input + ++input + ++input;
        System.out.println(output);
    }

    // uloha 5
    {
        int i, j, k, l = 0;
        k = l++;
        j = ++k;
        i = j++;
        System.out.println(i);
    }

}
