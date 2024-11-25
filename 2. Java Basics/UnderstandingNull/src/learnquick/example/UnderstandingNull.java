package learnquick.example;

public class UnderstandingNull {

    static Object obj1 = new Object();
    static Object obj2;     // init to null by default

    static String myStr;

    public static void main(String[] args) {

        Object localObj1 = new Object();
        Object localObj2;

        String name = "Java";
        String name2 = null;

        System.out.println("obj1 = " + obj1);
        System.out.println("obj2 = " + obj2);

        System.out.println("local obj1 = " + localObj1);
//        System.out.println("local obj2 = " + localObj2);

        System.out.println("name = " + name);
        System.out.println("name2 = " + name2);

        myStr.toLowerCase();
        System.out.println("mystr = " + myStr);
//        generates null ptr exception and stack trace
//        Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toLowerCase()" because "learnquick.example.UnderstandingNull.myStr" is null
//	at learnquick.example.UnderstandingNull.main(UnderstandingNull.java:27)

        System.out.println("Hello world!");
    }
}