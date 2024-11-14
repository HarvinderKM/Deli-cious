import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
 //create constructor, getters, setters
public class Sandwich {
    public static int size;
    public static List<String>regularToppingsList; //string array list for regular toppings
    public static List<String>premiumToppingsList; // string array list for premium toppings
    public static boolean toasted = false;
    static String breadType;

    //below are constructors

     //adding a sandwich method
    public static List<Sandwich> sandwichList = new ArrayList<>();

     public Sandwich(int size, List<String> regularToppingsList, List<String> premiumToppingsList, String bread, boolean toasted) {
         this.size = size;
         this.regularToppingsList = regularToppingsList;
         this.premiumToppingsList =
     }

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
        System.out.println("Which Sauce would you like? Mayo, Mustard, Ketchup, ranch,thousand islands, au jus, or sauce");
        for (int i = 1;i < 7; i++){ //can ask for up to 5 sauces if they want
            String regularToppings = OrderScreen.getAnswer("sauces: ");
            if (!regularToppings.isEmpty() && !regularToppings.equalsIgnoreCase("no")&& !regularToppings.equals(" ")){
                regularToppingsList.add(regularToppings);
                System.out.println(regularToppings);
            } if (regularToppings.equalsIgnoreCase("no")|| regularToppings.equals(" ")){
                break;
            }
        }
        String toast = OrderScreen.getAnswer("Want it toasted? (y or n): ");
        if (toast.equalsIgnoreCase("y")){
            toasted=true;
        }

        sandwichList.add(new Sandwich(size,regularToppingsList, premiumToppingsList,bread,toasted));
        System.out.println(sandwichList);
    }

     public int getSize() {
        return size;

    }

    public void setSize(int size) {
        Sandwich.size = size;
    }

    public List<String> getRegularToppingsList() {
        return regularToppingsList;
    }

    public void setRegularToppingsList(List<String> regularToppingsList) {
        Sandwich.regularToppingsList = regularToppingsList;
    }

    public List<String> getPremiumToppingsList() {
        return premiumToppingsList;
    }

    public void setPremiumToppingsList(List<String> premiumToppingsList) {
        Sandwich.premiumToppingsList = premiumToppingsList;
    }

    public static String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        Sandwich.breadType = breadType;
    }

     public static boolean isToasted() {
         return toasted;
     }

     public static void setToasted(boolean toasted) {
         Sandwich.toasted = toasted;
     }

     public static List<Sandwich> getSandwichList() {
         return sandwichList;
     }

     public static void setSandwichList(List<Sandwich> sandwichList) {
         Sandwich.sandwichList = sandwichList;
     }

 }
