public class statement {
    public static void main(String[] args) {
        
        int i = 30;

        //Selection Statement
        //Normal if

      /*   if(i==24) {
            System.out.println("i is 24");
        }
        else {
            System.out.println("i is 25");
        } */

        // if- else ladder
        if (i % 5 == 0) { 
            System.out.println("i is divisible by 5");
        }
        if (i % 10 == 0) {
            System.out.println("i is divisible by 10"); // both were printed. but if - else if statement helps in solving this.
        }
        else { 
            System.out.println("i is not divisible by 5");
        }

        //Nested ifs---if ke andr if
      
      /*   if (i > 20) { 
            if (i < 30) { //will be executed only if i>20 is true.
                System.out.println("i is between 20 and 30");
            }
            else {
                System.out.println("i is greater than 30");
            }
        }
        else {
            System.out.println("i is not greater than 20");
        } */

        // this was nested if , but its not a recommended way. instead---

        if(i>20 && i<30) { // its checking for both conditions at the same time. if one is false then it will not execute the statement.
            System.out.println("i is between 20 and 30");
        }
        else { 
            System.out.println("i is 25");  // if the above statement is true, not execeuted.
        }

        // if-else-if ladder
        int a = 10;

        if (a == i) {
            System.out.println("a is equal to i");   
        }
         else if(a > 5) {
            System.out.println("a is greater than 5");
         }
         else if(a > i) {
            System.out.println("a is greater than i"); // code will not come here because a>5 is true.
         }   

        else {
                System.out.println("a is less than i"); // this printed means all above were false.
            }

        // flow of control will come here, after a>5 statement is executed.

    }
}
