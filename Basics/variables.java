public class variables {
    public static void main(String[] args) {
        // Integer --> byte, short, int, long
        // Binary (base 2), Octal (base 8), Decimal (base 10), Hexadecimal (base 16)

       // byte a = 0b101; //--> binary version of 5, add '0b' to indicate that it's a binary number
       // byte a = 05; //--> octal version of 5, add '0' to indicate that it's an octal number. Range (0-7).
       // byte a = 0x5; //--> hexadecimal version of 5 , add '0x' to indicate that it's a hexadecimal number, range= (0-15)..(0-9, A-F for 10,11,12..15).
       
       byte a = 5; //--> decimal version of 5 (most used).
       short b= 100;
        int c = 1000;
        long d = 10000;
        // long d = 1234_568_78_9980_00 // for big no. we can make it readable.


        // Real numbers --> float, double
        float f = 12.96f; // imp -- while declaring a float variable, we need to add 'f' at the end of the value

        // double g = 25.10101; -- > standard way.
        double g = 6.022e23; //--> scientific notation, e stands for exponent, 6.022 x 10^23


        //Character --> char
        char x = 'a'; // imp -- while declaring a char variable, we need to add single quotes at the end of the value

        // Boolean --> boolean
        boolean Startishard = true;

        System.out.println("Integer values--< " + a + " , " + b + " , " + c + " , " + d);
        System.out.println("floating values--< " + f + "," + g);
        System.out.println("Character value--< " + x);
        System.out.println("Boolean value--< " + Startishard);


    }

}
