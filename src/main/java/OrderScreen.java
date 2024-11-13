import java.util.Scanner;

public class OrderScreen {
    //All entries should show the newest entries first
    //o 1) Add Sandwich
    //o 2) Add Drink
    //o 3) Add Chips
    //o 4) Checkout
    //o 0) Cancel Order - delete the order and go back to the home page
public static void orderScreen (){
    System.out.println("(1)Add Sandwich\n(2)Add Drink\n(3)Add Chips\n(4)Checkout\n(5)Cancel Order\n(0)Go Back");
    do {
        // String answer = getAnswer("--> "); //call getanswer method and put in arrow to type,
        switch (getAnswer("--> ")){ // switch statement for order screen
            case "1":
                System.out.println("Add Sandwich");//new order
                Sandwich.addSandwich();
                break;
            case "2":
                System.out.println("Add Drink"); //new order
                break;
            case "3":
                System.out.println("Add Chips"); //new order
                break;
            case "4":
                System.out.println("Add Checkout"); //new order
                break;
            case "5":
                System.out.println("Canceled Order"); //new order
                break;
            case "0":
                System.exit(0); //exits program completely
                break;
            default:
                System.out.println("Invalid option - Try Again");
        }
    } while(true);
}
    public static String getAnswer(String q){ //getAnswer method returns string argument and is the question pass in question and it returns the string user types
        Scanner scanner = new Scanner(System.in);
        System.out.print(q);
        return scanner.nextLine();
    }
}
