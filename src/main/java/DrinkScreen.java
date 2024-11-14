import java.util.ArrayList;
import java.util.List;

public class DrinkScreen {
    private String size;
    private String flavor;

    public static List<DrinkScreen> drinkOrder = new ArrayList<>();
    public static double drinkPrice = 0; // fpr $
    public static void addDrink (){

        String answer = OrderScreen.getAnswer("Available drinks are: \n1)Coke (S,M,L) \n2)Sprite (S,M,L) \n----> ");

        switch (answer){
            case "coke S": case "1 S":
                DrinkScreen coke = new DrinkScreen("S","origional");
                drinkOrder.add(coke);
                drinkPrice += 2.00;
                break;
            case "coke M": case "1 M":
                DrinkScreen coke2 = new DrinkScreen("M","origional");
                drinkOrder.add(coke2);
                drinkPrice += 2.50;
                break;
            case "coke L": case "1 L":
                DrinkScreen coke3 = new DrinkScreen("L","origional");
                drinkOrder.add(coke3);
                drinkPrice += 3.00;
                break;
            case "sprite S": case"2 S":
                DrinkScreen sprite = new DrinkScreen("S","origional");
                drinkOrder.add(sprite);
                drinkPrice += 2.00;
                break;
            case "sprite": case"2 M":
                DrinkScreen sprite2 = new DrinkScreen("M","origional");
                drinkOrder.add(sprite2);
                drinkPrice += 2.50;
                break;
            case "sprite L": case"2 L":
                DrinkScreen sprite3 = new DrinkScreen("L","origional");
                drinkOrder.add(sprite3);
                drinkPrice += 3.00;
                break;
            default:
                System.out.println("Choice not available - try again");
        }
        OrderScreen.orderList.add(drinkOrder); // adds the drink to the order
        System.out.println(drinkOrder);// prints out ordered drink
        System.out.println(drinkPrice);

    }
//constructors
    public DrinkScreen(String size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }
//getters n setters
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
//to string
    @Override
    public String toString() {
        return "DrinkScreen{" +
                "size='" + size + '\'' +
                ", flavor='" + flavor + '\'' +
                '}';
    }
}
