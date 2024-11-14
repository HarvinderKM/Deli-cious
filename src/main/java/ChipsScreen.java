import java.util.ArrayList;
import java.util.List;

public class ChipsScreen {
    private String flavor;
    private String name;
    public static List<ChipsScreen> chipsOrder = new ArrayList<>();
    public static double chipPrice = 0; // fpr $
    public static void addChips (){

        String answer = OrderScreen.getAnswer("Available Chips are: \n1)Doritos \n2)Cheetos\n----> ");

        switch (answer){
            case "1":
                ChipsScreen doritos = new ChipsScreen("Doritos", "Cool Ranch");
                chipsOrder.add(doritos);
                chipPrice += 1.50;
                break;
            case "2":
                ChipsScreen cheetos = new ChipsScreen("Cheetos","Hot");
                chipsOrder.add(cheetos);
                chipPrice += 1.50;
                break;
            default:
                System.out.println("Choice not available - pick a number");
        }
        OrderScreen.orderList.add(chipsOrder); // adds the drink to the order
        System.out.println(chipsOrder);// prints out ordered drink
        System.out.println(chipPrice);

    }
    //constructor
    public ChipsScreen(String name, String flavor) {
        this.flavor = flavor;
        this.name = name;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ChipsScreen{" +
                "flavor='" + flavor + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
