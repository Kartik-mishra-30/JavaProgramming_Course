public class statement2 {
    public static void main(String[] args) {

        //Switch Statements---> byte, int, short, char , Emuneration---> only these works.

        int i = 3;

        switch (i) {
            case 1:
                System.out.println("i is 1");
                break;
            case 2:
                System.out.println("i is 2");
                break;
            case 3: 
                System.out.println("i is 3");
                break;
            default:
                System.out.println("i>3 | i<1");            
            case 4:
                
        }
        // switch --> limited use case -> should evaluate to byte, short, int, char, Enumeration.
        // No duplicate cases allowed.
        // After JDK7 Strings can also be used as switch expression. 
        // After JDK-14 switch is enhanced too much.

        //Nested Switch
        int j = 5;
        int k = 1;
        switch(j) {
            case 4:
                System.out.println("j is 4");
                break;
            case 5:
                switch(k) {
                    case 1:
                        switch(j) {

                        }
                    case 2:
                        break;
                }
             default:
                System.out.println("j is not 4 && 5");
                break;

                //THESE ARE CALLED
                // SELECTION STATEMENTS.



        }

    }
    
    
    
    
    

}
