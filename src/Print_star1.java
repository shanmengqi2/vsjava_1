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
    
    for (int i = 0; i < rows; i++) {  //�е�ѭ��

        for (int j = 0; j < i+1; j++) {   //ÿ�����е�ѭ����Ҳ���Ǵ�ӡ*
            System.out.print("*");
        }

        System.out.println("");
    }

    }
}
