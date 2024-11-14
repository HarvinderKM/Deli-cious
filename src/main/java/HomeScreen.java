import java.io.IOException;
import java.util.Scanner;

public class HomeScreen {
    //application should continue to run until user chooses to exit
    // 1) New Order
    // 2) Exit
    public static void main(String[] args) throws IOException {
        System.out.println("(1) New Order \n(0) exit");
        do {
           // String answer = getAnswer("--> "); //call getanswer method and put in arrow to type,
            switch (getAnswer("--> ")){
                case "1":
                    System.out.println("Making a New Order");//new order
                    OrderScreen.orderScreen(); //calls the order screen
                    break;
                case "0":
                    System.exit(0); //exits program completely
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
