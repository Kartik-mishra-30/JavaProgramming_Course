public class floats {
    public static void main(String[] args) {
     //How floating numbers are stored in Java?

     float f = 0.7f;
     float g = 8.125f; //- Value of g: 8.12500000000000000000

       System.out.printf("Value of g: %.20f%n", g); // -> to print the value with 20 decimal places.
       System.out.printf("Value of f: %.20f%n", f);//--Value of f: 0.69999998807907100000....why?
       System.out.println(f);//--> Prints 0.7.. why?

       //Conclusion -->0.699999988079071000...is how 0.7 is stored in memory,we print normally it gives us round off value.

       // How Negative numbers are stored in Java?
       
       byte c = -42;
       System.out.println(c);


       

       
       
       
    }
}   