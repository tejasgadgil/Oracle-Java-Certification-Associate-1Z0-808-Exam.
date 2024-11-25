package learnquick.example;

public class DeclaringAndInitializingVariables {
    public static void main(String[] args) {
//        declaring and initializing separately
        int num;    // declaration
        num = 10;   // initialization
        System.out.println("num = " + num);

        double dub = 7.50;  // declaration and initialization
        System.out.println("dub = " + dub);

        // not best practice
        float fl1, fl2, fl3;
        float fl4; float fl5;
        float fl6 = 5f, fl7 = 6f, fl8;

//        identifiers: names for variables, methods, etc
//        for legal identifier: names must begin in letter, dollar sign, underscore
//        names can contain nums but cant start with nums
//        cant use java reserved keyword
//        java is case sensitive

        int number1;
        int $num;
        int _num$2;

//        int int;    // illegal
//        int 3num;  // illegal
//        int num@4   //illegal

        System.out.println("Hello world!");


    }
}