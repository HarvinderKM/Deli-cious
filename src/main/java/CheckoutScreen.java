import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CheckoutScreen {
   // Confirm - create the receipt file and go back to the home screen
   // o Cancel - delete order and go back to the home screen
public static void checkout() throws IOException {
    for (int i = 0; i < OrderScreen.orderList.size();i++){
        System.out.println(OrderScreen.orderList.get(i));
    }
    System.out.println(("total: " +(Sandwich.getSandwichPrice() + ChipsScreen.chipPrice + DrinkScreen.drinkPrice)));
    String answer = OrderScreen.getAnswer("confirm order (y/n) \n---> ");
    switch(answer) {
        case "y":
            BufferedWriter bw = new BufferedWriter(new FileWriter("orders.txt",true));
            bw.write(OrderScreen.orderList.toString());
            bw.write("total: " + (Sandwich.getSandwichPrice() + ChipsScreen.chipPrice + DrinkScreen.drinkPrice)+ "\n");
            bw.close();
            break;
        default:
            System.out.println("Pick y or n");
    }
}

public static void cancelOrder(){
    OrderScreen.orderList.clear();
    System.out.println(OrderScreen.orderList);

}
}
