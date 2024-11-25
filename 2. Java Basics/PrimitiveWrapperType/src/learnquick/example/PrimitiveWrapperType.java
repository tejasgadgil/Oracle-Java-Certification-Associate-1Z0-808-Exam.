package learnquick.example;

public class PrimitiveWrapperType {
    public static void main(String[] args) {

        int myInt = 10;

        Integer myInteger = new Integer(10);        // unnecessary boxing
        Integer myInteger1 = 20;
        Integer myInteger2 = Integer.valueOf(13);
        Integer myInteger3 = Integer.parseInt("3");
        Integer myInteger4 = null;

//        int myInt2 = null;

        System.out.println("myInteger = " + myInteger);
        System.out.println("myInteger1 = " + myInteger1);
        System.out.println("myInteger2 = " + myInteger2);
        System.out.println("myInteger3 = " + myInteger3);
        System.out.println("myInteger4 = " + myInteger4);

//        converting Integer to int = unboxing
//        converting wrapper to primitive = unboxing
        int myInt2 = myInteger2;
        int myInt3 = myInteger4;       // be careful, produces null ptr exception

//        converting primitive to wrapper = boxing
//        converting int to Integer = boxing
        Integer myInteger5 = new Integer(myInt2);
        Integer myInteger6 = myInt;

        printSum(1, 5);     // autoboxing
        printSum(myInteger, myInteger1);    // not autoboxing

//        Prefer primitives for performance and simplicity.
//        Use wrapper classes when objects are required or when you need additional functionality.


        System.out.println("Hello world!");
    }

    private static void printSum(Integer first, Integer second){
        Integer sum = first + second;
        System.out.println("sum = " + sum);
    }
}