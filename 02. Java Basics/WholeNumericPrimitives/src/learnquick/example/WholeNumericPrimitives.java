package learnquick.example;

public class WholeNumericPrimitives {
    public static void main(String[] args) {
        long big = 12_345_678_901L;  // use _ like a comma for readability

//        octal numbers (0 - 7)
        int firstOct = 010;     // 8 decimal
        int secondOct = 022;    // 18 decimal

        int sumOct = firstOct + secondOct;  // 26 decimal, 32 octal
        System.out.println("first oct: " + firstOct + " second oct: " + secondOct);
        System.out.println("sum: " + sumOct + " sum in octal : " + Integer.toOctalString(firstOct + secondOct));

        System.out.println(" ");

//        hexadecimal numbers (0 - 9 and A - F)
        int firstHex = 0xF;     // 15 decimal
        int secondHex = 0x1E;   //30 decimal

        int sumHex = firstHex + secondHex;  // 45 decimal, 2d hex
        System.out.println("first hex: " + firstHex + " second hex: " + secondHex);
        System.out.println("sum: " + sumHex + " sum in hexadecimal : " + Integer.toHexString(firstHex + secondHex));

        System.out.println(" ");

//        binary numbers (0/1)
        int firstBin = 0b001;     // 1 decimal
        int secondBin = 0b1011;   //11 decimal

        int sumBin = firstBin + secondBin;  // 12 decimal, 1100 binary
        System.out.println("first bin: " + firstBin + " second bin: " + secondBin);
        System.out.println("sum: " + sumBin + " sum in binary : " + Integer.toBinaryString(firstBin + secondBin));







    }
}