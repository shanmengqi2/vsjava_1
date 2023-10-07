import java.util.Random;

public class Lucky7 {
    public static void main(String[] args) {


        /*
         * variables
         */

         int num1;
         int num2;
         int num3;

         int hasMoney = 5;
         int n_count;



        while (hasMoney>0) {

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
         * calculate numbers;
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
        
        }

        System.out.println("You have"+ hasMoney +"euros left");
        System.out.println("Game Over");









        


    }
}
