import java.util.Scanner;

public class javatest3 {
    public static void main(String[] args) {
        Scanner sacn = new Scanner(System.in);
        String lactivitylevel = "";
        int amounttype = 0;
        int amountStreng = 0;

        System.out.println("Activity level of exercise (vigorous/moderate)?");
        lactivitylevel = sacn.nextLine();

        for (int i = 0; i < 7; i++) {
           
            System.out.println("Minutes on "+(i+1)+". day?");
            
            amounttype = amounttype + Integer.parseInt(sacn.nextLine());

        }
        System.out.println("How many times you did muscle strengthening and balance activities?");
        amountStreng = Integer.parseInt(sacn.nextLine());

        System.out.println("You did "+amounttype+" minutes "+lactivitylevel+" exercise during week.");
        if(checkActivityRecommendation(lactivitylevel, amounttype) && amountStreng>=2){
            System.out.println("You exercise enough according to the recommendations!");
        }


        

    }
    public static boolean checkActivityRecommendation(String lactivitylevel, int amounttype){

       

        if(lactivitylevel.equalsIgnoreCase("moderate")){
 
             if(amounttype >= 150) {

                return true;
               
             }
             else{
                return false;
               
             }
 
        }
        else if(lactivitylevel.equalsIgnoreCase("vigorous")){
 
             if(amounttype >= 75) {

                return true;
             
             }
             else{
                return false;
                
             }
 
        }
        return false;
 
     }
}
