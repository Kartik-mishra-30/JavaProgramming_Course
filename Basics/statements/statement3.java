package statements;

public class statement3 {
    public static void main(String[]args){

          //Iteration Statemments
          //1. While Loop

         /*  int i = 1;
         int j= 3;
         while ( i <= j) {
         System.out.println("i is greater than 1");
         i++; // result is we get - i is freaetr than 1 , 3 times.
         } */
        
         /*int i = 1; // We have to loop this 3 times- 1, 2 ,3
            while(i<=3) { // this responsible for how many times we loop 1 2 3 .
            int j = 1;
            while (j<=3) { // resposnsible for what we want to loop.
              System.out.println(j);
             j++;
            }
            i++; // this will help us to loop the above while loop 3 times.
         } */
           // An easier version would be to use for loop instead of while loop.
        
         //2. Do-While Loop
        //     int k = 1;    
        //    do{
        //     System.out.println("Play game"); 
        //     k++;
        //    } while (k == 2);

        //    //3. For Loop
        //    for (int i = 1 ; i<=10 ; i++) {
        //     System.out.println(i);
        //    }

        //    for ( int i = 1,j=1 ; i<=5 && j<=3 ; i++,j++) {
        //     System.out.println(i);
        //    }

               //Nested for loop
            //    for ( int i =1; i<=5 ; i++) {
            //      for ( int j = 1; j<=5 ; j++) {
            //         System.out.print("* ");
            //      }
            //      System.out.println();
            //    }

            // for ( int i =1; i<=5 ; i++) {
            //      for ( int j = 1; j<=i ; j++) {
            //         System.out.print("* ");
            //      }
            //      System.out.println();
            //    }

               //Jump statements---> break, continue.
                //1. Break
                // int p= 7;
                // for ( int i=2 ; i<p ; i++) {
                //     if (p % i == 0) {
                //         System.out.println("p is not prime");
                //         break; // it will come out of the loop as soon as it finds a factor of p.
                //     }
                // } System.out.println("p is prime");

                //2. Continue
                // for ( int i = 1 ; i<=10 ; i++) {
                //     if (i % 2 == 0) {
                //         continue; // it will skip the even numbers and print only odd numbers.
                //     }
                //     System.out.println(i);
                // }

                // //Lables
                //  outer: for ( int i =1; i<=10 ; i++) { //----> *
                //  inner: for ( int j = 1; j<=i ; j++) { //----> **
                //     System.out.print("* ");//-------------->***
                //     if(j >=5) { // -------------------------- >****
                //         break outer; //----------------------->*****
                //     } //------------------------------------------> We got out of the loop as soon as j becomes 5. 
                // }
               
                //      System.out.println(); // control flow is here at j>=5.
                // }

                //CODE BLOACKS
                //  first:{
                //     second: {
                //         third:{
                //             System.out.println("Inside third block");
                //             break first ;
                //         }
                //     }
                //  }

     } 

}