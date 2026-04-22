package operators;

public class Logical {
    public static void main(String[] args) {
        // Logical Operators
       int a = 25;
       int b = 10;
       int c = 15;

       boolean d = (a < b) && (b < c);

       // Short circuit

       System.out.println(d); // false



        // Bitwise operators.
        int k = 2; // 00000000 00000000 00000000 00000010
        int l = 3; // 11
                  
        int m = k & l; // 10 --> 2
        int n = k | l; // 11 --> 3
        int p = k ^ l; // 01 --> 1
        int q = ~k; //  11111111 11111111 11111111 11111101 == -3

        System.out.println(m + " , " + n + " , " + p + " , " + q);

        byte g = 1;
        int h = (g << 8);  // 00000001 --> 1 00000000 --> 0
      
        System.out.println(h); // 256

        int x = 1;
        x = x << 33;

        System.out.println(x); // 2

        byte i = 127; // 01000000 --> 00000000
        byte j = (byte) (i >> 8);

        // >>>

        System.out.println(j); // 1
    }
    
}
