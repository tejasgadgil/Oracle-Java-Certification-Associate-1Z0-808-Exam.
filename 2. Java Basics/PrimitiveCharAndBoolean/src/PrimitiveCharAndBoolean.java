public class PrimitiveCharAndBoolean {
    public static void main(String[] args) {
//        char: 16bit data type

        char ch = 'a';
//        char ch1 = 'ab';     // wont compile

        char nm = '1';
        char unicodeCh = '\u03A9';      // uppercase greek omega char
        char romanNm = '\u216C';      // uppercase greek omega char

        System.out.println("ch = " + ch);
        System.out.println("nm = " + nm);

//        Find these in ascii table
        System.out.println("unicodeCh = " + unicodeCh);
        System.out.println("romanNm = " + romanNm);

//        bool: true or false flag
        boolean myBool = true;
        boolean myFalseBool = false;

        System.out.println("myBool = " + myBool);
        System.out.println("myFalseBool = " + myFalseBool);

//        true and false are reserved keywords
//        but true1 etc are not (not a good practice obvs)



        System.out.println("Hello world!");
    }
}