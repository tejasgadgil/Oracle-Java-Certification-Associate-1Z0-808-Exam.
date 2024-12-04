package learnquick.example;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int result = 3 - 2 + 2 * 2 + 3;     // 8
        System.out.println("result = " + result);

        result = 4 / 2 + 1 - 4 * 2 + 10;
//        2 + 1 - 8 + 10
//        3 - 8 + 10
//        -5 + 10
//        5
        System.out.println("result = " + result);

        int a = 4;
        result = 3 - 2 * --a;       // --a : decrement then use
//        3 - 2 * 3 ( a = 3)
//        3 - 6
//        -3
        System.out.println("result = " + result);

        a = 4;
        result = 3 - 2 * a--;       // a-- : use then decrement
//        3 - 2 * 4
//        a = 3
//        3 - 8
//        -5
        System.out.println("result = " + result);

        result = 10 - 3 * (2 + 1) - 4 / (1 + 3);
//        10 - 3 * 3 - 4 / 4
//        10 - 9 - 1
//        0
        System.out.println("result = " + result);

        int i = 3;
        int j = 2;

        result = 10 % i;
        System.out.println("result = " + result);

        result = 10 % j;
        System.out.println("result = " + result);


        int f = 12;
        int g = 5;
        int h = 2;
        result = f / 2 - 10 % (4 + 3) - 2 * f % g - h * 3;
//        12 / 2 - 10 % (4 + 3) - 2 * 12 % 5 - 2 * 3;
//        12 / 2 - 10 % 7 - 2 * 12 % 5 - 2 * 3
//        6 - 3 - 24 % 5 - 6
//        6 - 3 - 4 - 6
//        -7
        System.out.println("result = " + result);

















        System.out.println("Hello world!");
    }
}