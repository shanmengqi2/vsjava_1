public class Test222 {
    public static void main(String[] args) {
        /*
         * a. If the age is equal to 18, print: You can drive a car.

         * b. If the age is 10,20,30,40,50,60,70,80,90, 100, 110 or 120, print: Anniversary Party!!

         * c. If the age is 100, print three line congratulations!

         * d. If the age is between 40-50 wish happy mid-life.
         * 
         */
        int age = 100;
        System.out.println((age % 10));

		if (age > 0 && age < 18)
		{
			System.out.println("You are underage.");
		}

        else if(age == 18){    //a
            System.out.println("You can drive a car");
        }

        else if(age % 10 == 0){
                //b,10,20,30本质上是10的正整数倍，我们只要除以10求余，余数为0就满足条件
                
                System.out.println("Anniversary Party!!");
                
                if(age == 100){
                    System.out.println("Congratulations\nCongratulations\nCongratulations");
        }
		
        }
        else if(age>40 && age<50){
             System.out.println("wish happy mid-life");
        }
        
		else
		{
			System.out.println("You are an adult.");
		}
			
		System.out.println("Press space to exit.");
    }
}

