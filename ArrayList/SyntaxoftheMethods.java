public class SyntaxoftheMethods {


//     Below you can see a method printHelloHamk. Modify the method so, that when the method is called, it prints:

// Hello HAMK
// Be precise with the uppercase letters!
    public static void main(String[] args) {
        calculate(20,30, "substraction");
    }

    public int sumValues (int num1, int num2){

        // Write the code here
        int sum = num1+num2;

        return sum;

    
    }

    public static void calculate (int num1, int num2, String cal){

        // sum, subtraction or multiplication
        //The result is 6.

        int result = 0;

        if(cal.equalsIgnoreCase("sum")){

            result = num1 + num2;

        }
        else if(cal.equalsIgnoreCase("substraction"))
        {
            result = num1 - num2;
        }
        else if(cal.equalsIgnoreCase("multiplication")){
            result = num1 * num2;
        }

        System.out.println("The result is "+ result);


    }

}
