package learnquick;

/**
 * This is a java doc comment
 * these will appear in documentation
 * Used to describe classes and methods
 */

public class Main {

    /**
     * Hovering on main will display this custom documentation
     * @param args String array passed through Main -> edit config... -> program arguments
     */
    public static void main(String[] args) {

        // type sout and enter
        System.out.println("args.length = " + args.length);


        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }

        /*
        for (String arg : args) {
            System.out.println(arg);
        }
         */

    }
}