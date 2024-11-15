import java.util.List;
public class AddSandwich {
    private int size;
    private String breadType;
    private boolean toasted;
    private List<String> regularToppings;
    private List<String> premiumToppings;

//constructors
    public AddSandwich(int size, String breadType, boolean toasted, List<String> regularToppings, List<String> premiumToppings) {
        this.size = size;
        this.breadType = breadType;
        this.toasted = toasted;
        this.regularToppings = regularToppings;
        this.premiumToppings = premiumToppings;
    }
//getters and setters
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public List<String> getRegularToppings() {
        return regularToppings;
    }

    public void setRegularToppings(List<String> regularToppings) {
        this.regularToppings = regularToppings;
    }

    public List<String> getPremiumToppings() {
        return premiumToppings;
    }

    public void setPremiumToppings(List<String> premiumToppings) {
        this.premiumToppings = premiumToppings;
    }

    //generate to string below
    @Override
    public String toString() {
        return "AddSandwich{" +
                "size=" + size +
                ", breadType='" + breadType + '\'' +
                ", toasted=" + toasted +
                ", regularToppings=" + regularToppings +
                ", premiumToppings=" + premiumToppings +
                '}';
    }
}
