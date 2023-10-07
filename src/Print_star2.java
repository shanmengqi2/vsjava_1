import java.util.Scanner;

public class Print_star2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        int rows = 0;


        //main app
        System.out.println("how many rows?");
        rows = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < rows-i-1; j++) {
                System.out.print(" ");
            }
            
            for (int k = 0; k < i+1; k++) {
                System.out.print("*");
            }

            System.out.println("");
            
        }
    }
}
