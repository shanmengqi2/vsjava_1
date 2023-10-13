import java.util.Scanner;

public class javatest {
//Create method called checkActivityRecommendation that takes two parameters lactivitylevel type String and amounttype integer). f amount of exercise is 75 or more when activitylevel is "vigorous" or if amount of exercise is 150 ormore when activityLevel is "moderate" method will print ¡°You exercise enough according to the recommendations! else¡°You should exercise more!¡±
    public static void main(String[] args) {
        
    }


    public void checkActivityRecommendation(String lactivitylevel, int amounttype){

       

       if(lactivitylevel.equalsIgnoreCase("moderate")){

            if(amounttype >= 150) {
                System.out.println("You exercise enough according to the recommendations!");
            }
            else{
                System.out.println("You should exercise more!");
            }

       }
       else if(lactivitylevel.equalsIgnoreCase("vigorous")){

            if(amounttype >= 75) {
                 System.out.println("You exercise enough according to the recommendations!");
            }
            else{
                System.out.println("You should exercise more!");
            }

       }

    }



}
