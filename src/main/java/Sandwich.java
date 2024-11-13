import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    int size;
    List<String>regularToppingsList = new ArrayList<>();
    List<String>premiumToppingsList = new ArrayList<>();

    String breadType;

    public Sandwich(int size, List<String> regularToppingsList, List<String> premiumToppingsList, String breadType) {
        this.size = size;
        this.regularToppingsList = regularToppingsList;
        this.premiumToppingsList = premiumToppingsList;
        this.breadType = breadType;
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

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }
}
