import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        int[] employeesAges;
        employeesAges = new int[4];


        String[] employNames = {"shan","mengqi","qi","other"};

        for (int i = 0; i < employeesAges.length; i++) {
            employeesAges[i] = 30+i;
        }

        for (int i = 0; i < employeesAges.length; i++) {
            System.out.println(employeesAges[i]);
        }

        int[] points = new int[5];

        

        points[0] = 25;

        System.out.println(points[0]);


    }
}
