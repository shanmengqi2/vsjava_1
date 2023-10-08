import java.util.ArrayList;
import java.util.Scanner;

public class arrayquizex {
    public static void main(String[] args) {
// Create an app where the user can add items to a shopping list. Every item is stored in ArrayList. If the user types x, exit the loop and print the whole list.

// The output in the console should be:

// Add item (x = exit)
// Milk
// Add item (x = exit)
// Bread
// Add item (x = exit)
// Chips
// Add item (x = exit)
// x
// Milk
// Bread
// Chips
        Scanner scan = new Scanner(System.in);
        String inputTemp;

        ArrayList<String> shoppingList = new ArrayList<String>();
        while (true) {
            System.out.println("Add item (x = exit)");
            inputTemp = scan.nextLine();
            if (inputTemp.equalsIgnoreCase("x")) {
                break;
            }
            shoppingList.add(inputTemp);
            

            }

        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println(shoppingList.get(i));
        }
        }

    }

