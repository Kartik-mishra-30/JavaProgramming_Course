package operators;

public class arithmetic {
    public static void main(String[] args) {
        //Arithmetic Operators
        int a= 5;
        int b= 10;

        int c= a + b; // Addition
        int d= b - a; // Subtraction
        int e= a * b; // Multiplication
        int f= b / a; // Division
        int g= b % a; // Modulus--- o/p = remainder

        System.out.println(c + " , " + d + " , " + e + " , " + f + " , " + g);
        
        // Some Other useful Operators

        int h = a + 2;

        //h = h + 2; // Since this is okay in CSE
        h += 2; // h = h + 2; // h = 9

        h -= 2; // h = h - 2; // 7

        h *= 3; // h = h * 3;
        h /= 5; // h = h / 5;
        h %= 5; // h = h % 5;

        System.out.println(h); 

        int i = 6;
        i++; // i = i + 1 --> i += 1; 
        i--; // i = i - 1 --> i -= 1;
        
        System.out.println(i); // i = 7;

        // pre increment and post increment/decrement.

        int j = 7;
        j++;  //postfix increment
        ++j; // prefix increment
        
        // j = 9
        int k = j++; // k = j; j = j + 1;
        System.out.println(j + " , " + k); // 10, 9

        int l = ++j; // l = j + 1;

        System.out.println(j + " , " + l); // 11, 11
    }
    
}
