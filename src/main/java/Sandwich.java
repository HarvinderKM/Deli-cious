import java.util.ArrayList;
import java.util.List;
 //create constructor, getters, setters
public class Sandwich { //inherits from order class (extends)
    private  int size;
    private  List<String>regularToppingsList; //string array list for regular toppings
    private  List<String>premiumToppingsList; // string array list for premium toppings
    private  boolean toasted = false;
    private  String breadType;
    public static double sandwichPrice = 0;

    //below are constructors

     //adding a sandwich method
    public static List<Sandwich> sandwichList = new ArrayList<>();

     public Sandwich(int size, List<String> regularToppingsList, List<String> premiumToppingsList, String bread, boolean toasted) {
         this.size = size;
         this.regularToppingsList = regularToppingsList;
         this.premiumToppingsList = premiumToppingsList;
         this.breadType = bread;
         this.toasted = toasted;
     }

     public static List<String> customerRegularToppings = new ArrayList();
     public static List<String> customerPremiumToppings = new ArrayList();
     public static void addSandwich(){
        System.out.println("Choose a Sandwich size: 4in, 8in, or 12in \nEnter a #:");
        int size = Integer.parseInt(OrderScreen.getAnswer("size: "));
        System.out.println(size);

        System.out.println("Choose your Sandwich bread option: white, rye, wheat, or a wrap \nType the bread");
        String bread = OrderScreen.getAnswer("bread: ");
        System.out.println(bread);

        System.out.println("Choose your Protein options: Steak, ham, Salami, roast beef, chicken, bacon \nType the protein\n(No meat? click 'space' + 'enter;)");
        for (int i = 1;i < 5; i++){ //can ask for up to 6 meats if they want
            String meat = OrderScreen.getAnswer("meat: ");
            if (!meat.isEmpty() && !meat.equalsIgnoreCase("no")&& !meat.equals(" ")){
                customerPremiumToppings.add(meat);
                System.out.println(meat);
            } if (meat.equalsIgnoreCase("no")|| meat.equals(" ")){
            break;
            }
        }
        System.out.println("Choose your Cheese Options: American, provolone, cheddar, or swiss");
        for (int i = 1;i < 4; i++){ //can ask for up to 3 cheeses if they want
            String cheese = OrderScreen.getAnswer("cheese: ");
            if (!cheese.isEmpty() && !cheese.equalsIgnoreCase("no")&& !cheese.equals(" ")){
                customerPremiumToppings.add(cheese);
                System.out.println(cheese);
            } if (cheese.equalsIgnoreCase("no")|| cheese.equals(" ")){
                break;
            }
        }

        System.out.println("Choose Your Toppings!\nRegular toppings: lettuce, peppers, onions, tomatoes, jalapenos, cucumbers, pickles, guacamole, and mushrooms");
        for (int i = 1;i < 9; i++){ //can ask for up to 9 toppings if they want
            String regularToppings = OrderScreen.getAnswer("regular toppings: ");
            if (!regularToppings.isEmpty() && !regularToppings.equalsIgnoreCase("no")&& !regularToppings.equals(" ")){
                customerRegularToppings.add(regularToppings);
                System.out.println(regularToppings);
            } if (regularToppings.equalsIgnoreCase("no")|| regularToppings.equals(" ")){
                break;
            }
        }

        System.out.println("Which Sauce would you like? Mayo, Mustard, Ketchup, ranch,thousand islands, au jus, or sauce");
        for (int i = 1;i < 7; i++){ //can ask for up to 5 sauces if they want
            String regularToppings = OrderScreen.getAnswer("sauces: ");
            if (!regularToppings.isEmpty() && !regularToppings.equalsIgnoreCase("no")&& !regularToppings.equals(" ")){
                customerRegularToppings.add(regularToppings);
                System.out.println(regularToppings);
            } if (regularToppings.equalsIgnoreCase("no")|| regularToppings.equals(" ")){
                break;
            }
        }
        //toasted?
         boolean toast1= false;
        String toast = OrderScreen.getAnswer("Want it toasted? (y or n): ");
        if (toast.equalsIgnoreCase("y")){
            toast1=true;
        }

        //add sandwich to list below
        Sandwich sandwich = new Sandwich(size,customerRegularToppings, customerPremiumToppings,bread,toast1);
        sandwichList.add(sandwich);
        OrderScreen.orderList.add(sandwichList);
        System.out.println(sandwichList);
        System.out.println(OrderScreen.orderList);
        System.out.println(getSandwichPrice());

    }
    //new method returns double
     public static double getSandwichPrice(){
         double total = 0;
         List<String> regularToppings = sandwichList.get(0).getRegularToppingsList();
         List<String> premiumToppings = sandwichList.get(0).getPremiumToppingsList();
         int size = sandwichList.get(0).getSize();
         String bread = sandwichList.get(0).getBreadType();
         boolean toasted = sandwichList.get(0).isToasted();

         if (size == 4) {
             for (String topping : premiumToppings){
                 if (premiumToppings.contains("steak")||premiumToppings.contains("ham")||premiumToppings.contains("salami")
                         ||premiumToppings.contains("roast beef")||premiumToppings.contains("chicken")||premiumToppings.contains("bacon")){
                     total+= 1.0;
                 }
                 if (premiumToppings.contains("american")||premiumToppings.contains("provolone")||premiumToppings.contains("cheddar")
                         ||premiumToppings.contains("swiss")) {
                     total += .75;
                 }

             }
         }
         if (size == 8) {
             for (String topping : premiumToppings){
                 if (premiumToppings.contains("steak")||premiumToppings.contains("ham")||premiumToppings.contains("salami")
                         ||premiumToppings.contains("roast beef")||premiumToppings.contains("chicken")||premiumToppings.contains("bacon")){
                     total+= 2.0;
                 }
                 if (premiumToppings.contains("american")||premiumToppings.contains("provolone")||premiumToppings.contains("cheddar")
                         ||premiumToppings.contains("swiss")) {
                     total += 1.50;
                 }

             }
         }
         if (size == 12) {
             for (String topping : premiumToppings){
                 if (premiumToppings.contains("steak")||premiumToppings.contains("ham")||premiumToppings.contains("salami")
                         ||premiumToppings.contains("roast beef")||premiumToppings.contains("chicken")||premiumToppings.contains("bacon")){
                     total+= 3.0;
                 }
                 if (premiumToppings.contains("american")||premiumToppings.contains("provolone")||premiumToppings.contains("cheddar")
                         ||premiumToppings.contains("swiss")) {
                     total += 2.25;
                 }

             }
         }


        return total;
     }

//getters and setters
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

     public boolean isToasted() {
         return toasted;
     }

     public void setToasted(boolean toasted) {
         this.toasted = toasted;
     }

     public String getBreadType() {
         return breadType;
     }

     public void setBreadType(String breadType) {
         this.breadType = breadType;
     }

     //generate to string

     @Override
     public String toString() {
         return "Sandwich{" +
                 "size=" + size +
                 ", regularToppingsList=" + regularToppingsList +
                 ", premiumToppingsList=" + premiumToppingsList +
                 ", toasted=" + toasted +
                 ", breadType='" + breadType + '\'' +
                 '}';
     }
 }

