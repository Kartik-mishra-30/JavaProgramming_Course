public class conversions {
    public static void main(String[] args) {
        
        //1. Implicit conversion 
        // (byte to int)
        // byte b = 24;
        // int i;

        // i = b;
        // System.out.println(i); // 24- expected output

        // character to int
        // char c = 'a';
        // int i;

        // i = c;

        // System.out.println(i); // 97-- unicode value of 'a'

        // 2. Explicit conversion
        // int i = 300;
        // byte b; // -128 to +127--> out of range

        // b = (byte) i; // it takes first 8 bits of the binary representation of 300 and converts it to byte
        // System.out.println(b); // 300 % 256 = 44

        // 3. Truncating conversion
        // float f = 15.678f;
        // int i;

        // i = (int) f;
        // System.out.println(i); // 15

        // Boolean to any data type
        // These conversions are not possible

        // boolean bool = false;
        // int i;

        // i = bool; cant use casting too
        
        byte b = 50;
        b = (byte) (b * 2); // 100

        System.out.println(b);
    }
}
