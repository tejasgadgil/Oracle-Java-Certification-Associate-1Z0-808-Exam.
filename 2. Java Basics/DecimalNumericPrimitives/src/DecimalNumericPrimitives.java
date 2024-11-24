public class DecimalNumericPrimitives {
    public static void main(String[] args) {

        // all decimals are by default double
        // so you need to specify all floats using f or F
        // double can also be denoted by adding d or D at end, but this is redundant
        float myNum = 3.14f;
        double myDouble1 = 3.14;
        double myDouble2 = 3.14f;   // converted to double
        double myDouble3 = 3.14D;
        double scientific = 5.000123E03;    // same as 5000.123, can also be written as 5.000123E3
        System.out.println("scientific (after compiling): " + scientific);


//        hexadecimal as double
        double hexPi = 0x1.91eb851eb851fp1;
        System.out.println("HexPi = " + hexPi);






//        double before = 3_.14;      // doesnt compile
//        double after = 3._14;      // doesnt compile
//        double first = _3.14;      // doesnt compile
//        double last = 3.14_;      // doesnt compile





        System.out.println("Hello world!");
    }
}