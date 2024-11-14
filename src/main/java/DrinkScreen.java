import java.util.ArrayList;
import java.util.List;

public class DrinkScreen {
    private String size;
    private String flavor;

    public static List<DrinkScreen> drinkOrder = new ArrayList<>();
    public static void addDrink (){
        String answer = OrderScreen.getAnswer("Available drinks are: \n1)Coke (S,M,L) \n2)Sprite (S,M,L) \n----> ");

        switch (answer){
            case "coke S": case "1 S":
                DrinkScreen coke = new DrinkScreen("S","origional");
                drinkOrder.add(coke);
                break;
            case "coke M": case "1 M":
                DrinkScreen coke2 = new DrinkScreen("M","origional");
                drinkOrder.add(coke2);
                break;
            case "coke L": case "1 L":
                DrinkScreen coke3 = new DrinkScreen("L","origional");
                drinkOrder.add(coke3);
                break;
            case "sprite S": case"2 S":
                DrinkScreen sprite = new DrinkScreen("S","origional");
                drinkOrder.add(sprite);
                break;
            case "sprite": case"2":
                DrinkScreen sprite2 = new DrinkScreen("M","origional");
                drinkOrder.add(sprite2);
                break;
            case "sprite L": case"2 L":
                DrinkScreen sprite3 = new DrinkScreen("L","origional");
                drinkOrder.add(sprite3);
                break;
            default:
                System.out.println("Choice not available - try again");
        }
        System.out.println(drinkOrder);

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
