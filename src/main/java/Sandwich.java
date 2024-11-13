import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
 //create constructor, getters, setters
public class Sandwich {
    static int size;
    List<String>regularToppingsList = new ArrayList<>(); //string array list for regular toppings
    List<String>premiumToppingsList = new ArrayList<>(); // string array list for premium toppings

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
        String bread = OrderScreen.getAnswer("size: ");
        System.out.println(bread);


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
