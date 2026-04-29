package practise;

public class practise1 {
    public static void main(String[] args) {

     // Conditional Statements
       // Quesn 1 

       int a = 25;
        if(a > 0) {
            System.out.println("positive no.");
        }
        else {
            System.out.println("negative no.");
            }

       // Quesn 2
       
        if(a % 2 == 0 ) {
            System.out.println("Even no.");
        }
        else {
            System.out.println("Odd no.");
        }

         // Quesn 3

         int c = 25;
          if (c >= 18) {
            System.out.println("Eligible to vote");
          }
        else {
            System.out.println("Not eligible to vote");
        }

        // Quesn 4

        if (a>c) {
            System.out.println("a is greater");
        }
        else {
            System.out.println("c is greater");
        }

        // Quesn 5

        int d = 22; //--- temperature
        if (d <10){
            System.out.println("Very cold");
        }
        else if (d>=10 && d<25) {
            System.out.println("Moderate");
        }
        else {
            System.out.println("Hot");
        }

        //Quesn 6

        int m = 63; // marks
        if (m >= 90) {
            System.out.println("Grade: A");
        }
        else if (m >= 75) {
            System.out.println("Grade: B");
        }
        else if (m >= 60) {
            System.out.println("Grade: C");
        }
        else if (m >= 40) {
            System.out.println("Grade: D");
        }
        else {
            System.out.println("FAIL");
        }

        //Quesn 7

        if (a>c && a>m) {
            System.out.println("a is greatest"); 
        }
        else if (c>m && c>a) {
            System.out.println("c is greatest");
        }
        else if (m>a && m>c) {
            System.out.println("m is greatest");
        }
      // imp : >= should be used instead of >, for tie case at the maximum.
      // ----> a=c case, nothing will change , we get right o/p. but if a=m or c=m , then we will get wrong o/p.

       //Quesn 8

         if(a>0){
         System.out.println("Positive no.");
         }
         else if (a<0){
         System.out.println("Negative No.");
         }
         else{
         System.out.println("ZERO");
         }
 
       //Quesn 9

       int i= 3 ; 
         switch(i) {
           case 1: System.out.println("Monday");
           i++;
           break;
           case 2: System.out.println("Tuesday");
           i++;
           break;
           case 3: System.out.println("Wednesday");
           i++;
           break;
           case 4: System.out.println("Thursday");
           i++;
           break;
           case 5: System.out.println("Friday");
           i++;
           break;
           case 6: System.out.println("Saturday");
           i++;
           break;
           case 7: System.out.println("Sunday");
           break;
        }
        // note-switch(i) is evaluated once → i = 1.
        // i++ inside a case does not affect which case runs. - its irrelevant here.

        //Quesn 10 ---> SIMPLE CALCULATOR----> for a better calculator with non fixed value we need "Scanner"

        int k = 4;
        int j = 5;
        char op = '/';

        switch (op) {
            case '+' : System.out.println(j+k);
                break;
            case '-':
                System.out.println(j - k);
                break;

            case '*':
                System.out.println(j * k);
                break;

            case '/':
                System.out.println((double)j / k); // we get answer in integer, bcz of int . if we want in decimal-- type cast.
                break;    
        
            default:
                System.out.println("Error");
                break;
        }
        
        // BONUS QUESN---if a year is leap year or not.

        // int x = 2400;
        // if(x % 400 == 0){
        //     System.out.println("Leap year");
        // }
        // else if(x % 4==0){
        //     if (x % 100 != 0){
        //         System.out.println("Leap year");
        //     }

        // }----------- 1st try--- forgot to write for non leap year - also correct but complex

        int x = 2400;
         if(x % 400 == 0 || (x % 4 ==0 && x % 100 != 0)){ // i tried this in start too, but i thought i cant use || with %.
            System.out.println("Leap year"); // that means i should never stop bcz of red lines while coding. 
        }
        else{
            System.out.println("Non leap year");
        }
    }
}

