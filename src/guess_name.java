import java.util.Scanner;

public class guess_name {
    public static void main(String[] args) {
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

    String inputName = "";
    int guessTimes = 0;
    boolean guessRight = true;

    Scanner scan = new Scanner(System.in);


    


    while (!guessRight && inputName.equalsIgnoreCase("stop")) {

        System.out.println("guess a name");
        inputName = scan.nextLine();

        if(inputName.equalsIgnoreCase("Emma")){
            System.out.println("Congratulations");
            guessRight = true;
        }
        else {
            guessRight = false;
        }

        guessTimes = guessTimes + 1;


    }
    

    }
}
