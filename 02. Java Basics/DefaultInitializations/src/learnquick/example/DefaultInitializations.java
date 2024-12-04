package learnquick.example;

public class DefaultInitializations {


//    global variables
    static boolean myBool;
    static byte myByte;
    static short myShort;
    static int myInt;
    static long myLong;
    static  float myFloat;
    static double myDouble;
    static char myChar;

    public static void main(String[] args) {

        int localInt;
//        local variables dont compile without initialization
//        System.out.println("localInt " + localInt);     // doesnt compile

        System.out.println("mybool = " + myBool);
        System.out.println("mybyte = " + myByte);
        System.out.println("myshort = " + myShort);
        System.out.println("myint = " + myInt);
        System.out.println("mylong = " + myLong);
        System.out.println("myfloat = " + myFloat);
        System.out.println("mydouble = " + myDouble);
        System.out.println("mychar = " + myChar);

//        default initializations of global variables
//        mybool = false
//        mybyte = 0
//        myshort = 0
//        myint = 0
//        mylong = 0
//        myfloat = 0.0
//        mydouble = 0.0
//        mychar =


    }
}