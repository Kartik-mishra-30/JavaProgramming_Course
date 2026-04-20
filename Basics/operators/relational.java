package operators;

public class relational {
    public static void main(String[] args) {
        // Relational operators: ==, !=, <, >, <=, >=
        
        int a = 5;
        int b = 10;
        int x = 10;
        
        boolean c= a==b;//False
        boolean d= a!=b;//True
        boolean e= a>b;//False
        boolean f= a<=b;//True
        boolean g= b==x;//True
        
        a+= 5;// a= 10 
        boolean h= a==b;//True

        System.out.println(c + " , " + d + " , " + e + " , " + f + " , " + g + " , " + h);
        
        
    }
}