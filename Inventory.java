
import java.util.LinkedList;
import java.util.List;

public class Inventory implements Inventoryi {

    private static String[] itemNames = {"Shrek", "Spider Man III", "Game of Thrones", "Mortal Combat"};

    private List<Item> items;

    public Inventory() {
        items = new LinkedList<Item>();
        for (String itemName : itemNames) {
            items.add(new Item(itemName, true, Type.getRandom()));
        }
    }

    public void addItem(Item item) {
        if (!items.contains(item))
            items.add(item);
    }

    public void removeItem(Item item) {
        if (items.contains(item))
            items.remove(item);
    }

    public void changeItemType(String title, Type type) {
        for (Item item : items) {
            if (item.getTitle().equals(title) && !item.getType().equals(type)) {
       
                item.setType(type);
            }
        }
    }

    public List<Item> getAllItems() {
        return items;
    }

    public List<Item> getAllAvailableItems() {
        List<Item> availableItems = new LinkedList<Item>();
        for (Item item : items) {
            if (item.isAvailable())
                availableItems.add(item);
        }

        return availableItems;
    }
}