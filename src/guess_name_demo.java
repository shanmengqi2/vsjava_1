import java.util.Scanner;

public class guess_name_demo {
     /*
         * Create a quessing game.
First the app asks the user to guess a name. f the guess of the user is corect, print Congratulation!" and exit the oop. f the answer is incorect, the app asksagain. The user can stop quessing by typing "stop". Lastly, print how many times the user guessed.mportant - the right answer is Emma
The output in the console should be if the quesses were Olivia, Ava and Emma:
Guess my name (type stop to exit)
Olivia
Guess my name (type stop to exit)
Ava
Guess my name (type stop to exit)
Emma
Congratulations!
You guessed 3 times .
         */

    public static void main(String[] args) {

    String guessName ="";
    int guessTimes = 0;
    Boolean guessRight = false; 
    Scanner scan = new Scanner(System.in);
    
   
    
    while (!guessRight && !guessName.equalsIgnoreCase("stop")) {

        System.out.println("guess a name");

        guessName = scan.nextLine();

        if(guessName.equalsIgnoreCase("Emma")){
            System.out.println("gongxi");
            guessRight = true;
        }
        else
        {
            guessRight = false;
        }


        if(!guessName.equalsIgnoreCase("stop")){
            
            guessTimes = guessTimes + 1;

        }
        


    }

    System.out.println("cai le "+guessTimes);









    





}
}
