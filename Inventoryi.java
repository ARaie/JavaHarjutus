
import java.util.List;

public interface Inventoryi {
    void addItem(Item item);

    void removeItem(Item item);

    void changeItemType(String title, Type type);

    List<Item> getAllItems();

    List<Item> getAllAvailableItems();
}
