import java.util.Scanner;

public class javatest2 {
    public static void main(String[] args) {
        Scanner sacn = new Scanner(System.in);
        String lactivitylevel = "";
        int amounttype = 0;

        System.out.println("Activity level of exercise (vigorous/moderate)?");
        lactivitylevel = sacn.nextLine();

        for (int i = 0; i < 7; i++) {
            //Minutes on 1. day?
            System.out.println("Minutes on "+(i+1)+". day?");
            
            amounttype = amounttype + Integer.parseInt(sacn.nextLine());

        }

        //You did 155 minutes moderate exercise during week.

        System.out.println("You did "+amounttype+" minutes "+lactivitylevel+" exercise during week.");
        
    }
}
