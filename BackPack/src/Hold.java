
import java.util.ArrayList;

public class Hold {

    private int maxWeight = 0;
    private ArrayList<Backpack> backpacks;


    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.backpacks = new ArrayList<>();
    }

    public void addBackpack(Backpack backpack) {

        if (holdWeight() + backpack.totalWeight() <= maxWeight) {
            backpacks.add(backpack);
        }
    }

    public int holdWeight() {
        int holdWeight = 0;
        for (Backpack items : backpacks) {
            holdWeight += items.totalWeight();
        }
        return holdWeight;
    }

    public void printItems() {
        for (Backpack items : backpacks) {
            items.printItems();
        }
    }

    public String toString() {
        return this.backpacks.size() + " backpacks (" + this.holdWeight() + " kg)";
    }

}

