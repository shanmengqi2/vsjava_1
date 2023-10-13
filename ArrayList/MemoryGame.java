import java.util.Random;
import java.util.Scanner;

public class MemoryGame {
    public static void main(String[] args) {
        int[] numArray = new int[7];
        int[] userGuess = new int[7];
        boolean guestRight = true;
        Random numRan = new Random();
        Scanner scan = new Scanner(System.in);


        //generate 7 ran numbers from 1-5 into array

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = numRan.nextInt(5)+1;
        }

        System.out.println("Try to remember the following numbers. The numbers will be shown for 4 seconds.");

        for (int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i]+"  ");
        }

        try { // The pause will last 1 second 
            Thread.sleep(4000); } 
        catch(InterruptedException ex) 
            { Thread.currentThread().interrupt(); }

        for (int i = 0; i < 20; ++i) 
        System.out.println();
        System.out.println("[the screen is cleared]");

        //begin to guess
        for (int i = 0; i < numArray.length; i++) {
            System.out.println("Type Number  "+(i+1));
            userGuess[i] = Integer.parseInt(scan.nextLine());

        }


        //show result
        System.out.println("The numbers were:");
        for (int i = 0; i < userGuess.length; i++) {
            System.out.print(numArray[i]+"  ");
        }
        System.out.println();

        System.out.println("Your Numbers were:");
        for (int i = 0; i < userGuess.length; i++) {
            System.out.print(userGuess[i]+"  ");
        }

        System.out.println();
        //compare
        for (int i = 0; i < userGuess.length; i++) {
            if(userGuess[i] == numArray[i]){
                guestRight = true;
            }
            else
            {
                guestRight = false;
            }
        }
       // System.out.println(guestRight);
        if(guestRight){
            System.out.println("You guess right, smart ass");
        }
        else{
            System.out.println("You're stupid...");
        }



    

    

        
    }


}
