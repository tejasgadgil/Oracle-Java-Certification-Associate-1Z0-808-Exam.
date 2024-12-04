package learnquick.example;

public class UnaryOperators {
    public static void main(String[] args) {

        int x = 5;
        int y = -x;

        System.out.println("x =" + x );
        System.out.println("y =" + y);

        boolean bool = !true;

        System.out.println("bool = " + bool);


//        the following dont compile
//        int myInt = !5;
//        boolean myBool = -true;
//        boolean test = !0;


//        Increment & Decrement
//        Have higher order than ( +, -, *, /, ...)

        int myInt1 = 5;
        int otherInt1 = ++myInt1;
        System.out.println("myInt1 = " + myInt1 + " otherInt1 = " + otherInt1);

        int myInt2 = 5;
        int otherInt2 = myInt2++;
        System.out.println("myInt2 = " + myInt2 + " otherInt2 = " + otherInt2);

        int count = 0;
        System.out.println(++count);    // 1
        System.out.println(count);      // 1
        System.out.println(count--);    // 1
        System.out.println(count);      // 0


//        exam questions
        int e = 3;
        int f = ++e * 4 / e-- + --e;
//        f = 4 * 4 / e-- + --e gives e = 4
//        f = 16 / 4 + --e gives e = 4-- = 3
//        f = 4 + 2 gives e = 2
        System.out.println("e = " + e + " f = " + f);

        int g = 6;
        int h = 2;
        int i = ++h + --g * 3 + 2 * g++ - h-- % --g;
//        i = 3 + --g * 3 + 2 * g++ - h-- % --g gives h = 3
//        i = 3 + 5 * 3 + 2 * g++ - h-- % --g gives h = 3, g = 5
//        i = 3 + 5 * 3 + 2 * 5 - h-- % --g gives h = 3, g = 6
//        i = 3 + 5 * 3 + 2 * 5 - 3 % --g gives h = 2, g = 6
//        i = 3 + 5 * 3 + 2 * 5 - 3 % 5 gives h = 2, g = 5
//        i = 3 + 15 + 10 - 3 % 5 gives h = 2, g = 5
//        i = 3 + 15 + 10 - 3 gives h = 2, g = 5
//        i = 25 gives h = 2, g = 5

        System.out.println("g = " + g + " h = " + h + " i = " + i);














        System.out.println("Hello world!");
    }
}