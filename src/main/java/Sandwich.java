import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
 //create constructor, getters, setters
public class Sandwich {
    static int size;
    public static List<String>regularToppingsList = new ArrayList<>(); //string array list for regular toppings
    public static List<String>premiumToppingsList = new ArrayList<>(); // string array list for premium toppings

    static String breadType;

    //below are constructors
    public Sandwich(int size, List<String> regularToppingsList, List<String> premiumToppingsList, String breadType) {
        this.size = size;
        this.regularToppingsList = regularToppingsList;
        this.premiumToppingsList = premiumToppingsList;
        this.breadType = breadType;
    }

    //adding a sandwich method
    public static List<Sandwich> sandwichList = new ArrayList<>();
    public static void addSandwich(){
        System.out.println("Sandwich size options: 4in, 8in, or 12in");
        int size = Integer.parseInt(OrderScreen.getAnswer("size: "));
        System.out.println(size);

        System.out.println("Sandwich bread options: white, rye, wheat, or a wrap");
        String bread = OrderScreen.getAnswer("bread: ");
        System.out.println(bread);

        System.out.println("Protein options: Steak, ham, Salami, roast beef, chicken, bacon");
        for (int i = 1;i < 5; i++){ //can ask for up to 6 meats if they want
            String meat = OrderScreen.getAnswer("meat: ");
            if (!meat.isEmpty() && !meat.equalsIgnoreCase("no")&& !meat.equals(" ")){
                premiumToppingsList.add(meat);
                System.out.println(meat);
            } if (meat.equalsIgnoreCase("no")|| meat.equals(" ")){
            break;
            }
        }
        System.out.println("Cheese Options: American, provolone, cheddar, or swiss");
        for (int i = 1;i < 4; i++){ //can ask for up to 3 cheeses if they want
            String cheese = OrderScreen.getAnswer("cheese: ");
            if (!cheese.isEmpty() && !cheese.equalsIgnoreCase("no")&& !cheese.equals(" ")){
                premiumToppingsList.add(cheese);
                System.out.println(cheese);
            } if (cheese.equalsIgnoreCase("no")|| cheese.equals(" ")){
                break;
            }
        }
        System.out.println(premiumToppingsList);
        System.out.println("Regular toppings: lettuce, peppers, onions, tomatoes, jalepenos, cucumbers, pickles, guacamole, and mushrooms");
        for (int i = 1;i < 9; i++){ //can ask for up to 9 toppings if they want
            String regularToppings = OrderScreen.getAnswer("regular toppings: ");
            if (!regularToppings.isEmpty() && !regularToppings.equalsIgnoreCase("no")&& !regularToppings.equals(" ")){
                regularToppingsList.add(regularToppings);
                System.out.println(regularToppings);
            } if (regularToppings.equalsIgnoreCase("no")|| regularToppings.equals(" ")){
                break;
            }
        }
        System.out.println(regularToppingsList);
        // sandwichList.add(sandwich);
    }

     public int getSize() {
        return size;

    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<String> getRegularToppingsList() {
        return regularToppingsList;
    }

    public void setRegularToppingsList(List<String> regularToppingsList) {
        this.regularToppingsList = regularToppingsList;
    }

    public List<String> getPremiumToppingsList() {
        return premiumToppingsList;
    }

    public void setPremiumToppingsList(List<String> premiumToppingsList) {
        this.premiumToppingsList = premiumToppingsList;
    }

    public static String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }
}
