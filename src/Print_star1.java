import java.util.Scanner;

public class Print_star1 {
    public static void main(String[] args) {
//this app is for print * from left to right
        Scanner scan = new Scanner(System.in);

    //variables declearation
    int rows=0;



    //main app
    System.out.println("how many rows?");
    
    rows = Integer.parseInt(scan.nextLine());
    
    for (int i = 0; i < rows; i++) {  //行的循环

        for (int j = 0; j < i+1; j++) {   //每行里列的循环，也就是打印*
            System.out.print("*");
        }

        System.out.println("");
    }

    }
}
