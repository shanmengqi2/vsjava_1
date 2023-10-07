import java.util.Random;
import java.util.Scanner;

public class Lucky77 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

         /*
         * variables
         */

         int num1;
         int num2;
         int num3;
         //String temp1;

         int hasMoney = 5;
         int n_count;
         String game_onString;
         boolean game_on = true;


         //before the game
         System.out.println("how much money do you want to bring in");
         hasMoney = Integer.parseInt(scan.nextLine());


        //game start
        while (hasMoney>0 && game_on) {

         /*
          * genarate random number;
          */
        n_count = 0;

         Random random = new Random();
         num1 = random.nextInt(7)+1;
         num2 = random.nextInt(7)+1;
         num3 = random.nextInt(7)+1;

         /*
          * print three random numbers;
          */
          System.out.println("Number1 is:"+num1);
          System.out.println("Number2 is:"+num2);
          System.out.println("Number3 is:"+num3);


        if (num1 == 7 || num2 ==7 || num3==7){

            System.out.println("You won!");

        }

        else {
            System.out.println("You lost!");
        }

        /*
         * calculate how many times 7;
         */

        if (num1 == 7) {
            n_count = n_count +1;
        }

        if (num2 == 7) {
            n_count = n_count +1;
        }

        if (num3 == 7) {
            n_count = n_count +1;
        }


       //process Money accroding to 7-times
        if (n_count == 0) {
                hasMoney = hasMoney -1;
            }
        else if(n_count ==1){

                hasMoney = hasMoney +2;

            }
        else if(n_count == 2){
                hasMoney = hasMoney +4;
            }
        else if(n_count == 3){
                hasMoney = hasMoney +9;
            }

        
        
        //after one-round game
        System.out.println("You have "+ hasMoney +" euros left");
        
        
             System.out.println("Continue? Type yes or no");
             game_onString = scan.nextLine();
             if (game_onString.equalsIgnoreCase("yes")){
                game_on = true;
             }
             else if (game_onString.equalsIgnoreCase("no")){
                game_on = false;
             }
        
       
            
        }



        
        System.out.println("Game Over");
    }
    
}
