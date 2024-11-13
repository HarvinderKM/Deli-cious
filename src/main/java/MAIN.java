import java.util.Scanner;
import java.util.Scanner;

public class MAIN {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MAIN app = new MAIN();
        app.run();
    }

    //method for displaying main menu
    public void displayMainMenu(){
    }

    // create method for keeping the system running
    public void run() {
        boolean running = true; //var will control the loop
        while (running) { // loop continues until running is set to false
            displayMainMenu(); //create a display main menu method  - this will display the main menu to the user every time it loops

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
