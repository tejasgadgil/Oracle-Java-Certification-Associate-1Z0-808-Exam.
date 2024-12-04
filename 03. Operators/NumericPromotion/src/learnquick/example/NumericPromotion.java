package learnquick.example;

public class NumericPromotion {
    public static void main(String[] args) {

//        Numeric Promotion is converting "smaller" type to "bigger" type
//        Rules for Numeric Promotion
//        1. When 2 vals have different data types, java auto promotes one val to the larger data type
//        2. integral and float : integral (byte short int long) promoted to float (float, double)
//        3. small types (byte short char) promoted to int any time they are used with binary arith opr (+, -)
//        4. result will have same data type as promoted operands

        byte z = 10;
        int x = 5;
        double y = 9.6;

        System.out.println("x + y + z = "+ (x + y + z));

//        Casting is converting "bigger" type to "smaller" type
        double myDouble = 1.7;
        int myInt = 3 + (int)myDouble;

        System.out.println("myInt = "+ myInt);

//        Overflow in Java occurs when a value exceeds the maximum or minimum limit of the data type it is stored in.
//        For example, if a byte variable (which can hold values from [-128 to 127]) is assigned a value outside this range, it "wraps around" to the opposite end of the range.
//        This behavior arises due to the fixed number of bits allocated for each primitive type.

        byte myByte = 125;
        int myInt2 = 15;
//        int myInt2 = 2;   // res = 127
//        int myInt2 = 3;   // res = -128
//        int myInt2 = 4;   // res = -127



        int intResult = myInt2 + myByte;
        int byteResult = (byte)(myInt2 + myByte);

        System.out.println("int result = "+ intResult);
        System.out.println("byte result = "+ byteResult);

//        double d = 2.3;
//        float f = 2.6;     // doesnt compile
//        System.out.println(d + f);

        short x1 = 14;
        short y1 = 6;
        System.out.println(x1/y1);

//        In Java, when performing arithmetic operations on smaller data types (byte, short, or char), they are promoted to int.
//        So, the division x1 / y1 will be performed as if x1 and y1 are of type int.
//        The result of the division will also be an int.


//        System.out.println("Hello world!");
    }
}