import java.util.Scanner;

public class MAIN {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MAIN page = new MAIN();
        page.run();
    }

    //method for displaying main menu
    public void displayMainMenu(){
        System.out.println("Welcome to MySubs!");
        System.out.println("How can I help you today?");
        System.out.println("Order A Sandwich --> 1 ");
        System.out.println("Toppings galore! --> 2 ");
        System.out.println("Drinks and sips-- 3 ");
        System.out.println("Chips and Dips -- 4 ");
        System.out.println("Please enter the Number correlated to your selection");
    }

    // order a sandwich method
    public void orderSandwich(){
        System.out.println("Our Most Popular Creations: ");
        System.out.println("TBA? - Turkey Bacon Avacado");
        System.out.println("BLT - Bacon Lettuce Tomatoes");
        System.out.println("Meatball Sub");
        System.out.println("Create Your Own");
    }

    public void personalizeSandwich(){
        System.out.println("Add Cheese --> 1");
        System.out.println("Add Sauces --> 2");
        System.out.println("Vegtables --> ");
        System.out.println("Toasted - Y or N");
        System.out.println("Return to Main Menu ");

        int option = scanner.nextInt(); // takes user input
        scanner.nextLine(); // consumes leftover line

        switch (option){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.out.println("Pick a Valid Number");
        }
    }

    // create method for keeping the system running
    public void run() {
        boolean running = true; //var will control the loop
        while (running) { // loop continues until running is set to false
            displayMainMenu(); //display main menu method  - this will display the main menu to the user every time it loops

            int choice = scanner.nextInt();// users menu choice
            scanner.nextLine(); //clears extra characters

            switch (choice){
                case 1:
                    //code
                    break;
                case 2:
                    break;
                default:
                    //code
            }

            //method for starting new order
            public void startNewOrder(){

            }

        }
    }}