
public class Main {

    public static void main(String[] args) {
        // Test items
        Item fishingRod = new Item("Fishing Rod", 2);
        Item flyBox = new Item("Fly Box", 1);
        Item net = new Item("Net", 1);

        Backpack backpack = new Backpack(5);
        backpack.addItem(fishingRod);
        backpack.addItem(flyBox);
        backpack.addItem(net);

        System.out.println("The backpack contains the following items:");
        backpack.printItems();
        System.out.println("Total weight: " + backpack.totalWeight() + " kg");
    }
}
