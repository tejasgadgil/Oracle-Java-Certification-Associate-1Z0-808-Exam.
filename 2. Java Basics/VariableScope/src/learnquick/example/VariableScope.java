package learnquick.example;

public class VariableScope {

    static int myGlobalInt = 10;

    public static void main(String[] args) {

        int myLocalInt = 9;

        {
            int myOtherInt = 8;
            System.out.println("insideblock: globalint = " + myGlobalInt);
            System.out.println("insideblock: localint = " + myLocalInt);
            System.out.println("insideblock: otherint = " + myOtherInt);

        }

        System.out.println("globalint = " + myGlobalInt);
        System.out.println("localint = " + myLocalInt);
//        System.out.println("otherint = " + myOtherInt);     // doesnt compile

        int myOtherInt = 7;
        System.out.println("otherint = " + myOtherInt);


    }
}