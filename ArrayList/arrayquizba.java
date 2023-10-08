import java.util.ArrayList;
import java.util.Collections;

public class arrayquizba {
    // Modify the code:

// Print the cars ArrayList
// Insert Ford after Kia
// Delete Tesla
// Change BMW to Audi
// Print "MODIFIED LIST"
// Print the whole list
// Sort the list
// Print "SORTED LIST"
// Print the whole list
// The output in the console should be:

// Kia
// Tesla
// BMW
// Renault
// MODIFIED LIST
// Kia
// Ford
// Audi
// Renault
// SORTED LIST
// Audi
// Ford
// Kia
// Renault

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Kia");
	    cars.add("Tesla");
	    cars.add("BMW");
	    cars.add("Renault");
    
        printList(cars);

        cars.add(1,"Ford");
        cars.remove(2);
        cars.set(2,"Audi");

        System.out.println("MODIFIED LIST");
        printList(cars);
        System.out.println("SORTED LIST");
        Collections.sort(cars);
        printList(cars);

        

    
    }
    public static void printList(ArrayList<String> AL){

        for (int i = 0; i < AL.size(); i++) {
            System.out.println(AL.get(i));
        }

    }
}
