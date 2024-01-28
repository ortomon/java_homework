package module2.homework1.ex3;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void addItem(Item[] items) {
        this.items.addAll(List.of(items));
    }

    public ArrayList<Item> getEvenItems() {
        ArrayList<Item> evenItems = new ArrayList<>();

        for (int i = 0; i < items.size(); i += 2) {
            evenItems.add(items.get(i));
        }

        return evenItems;
    }

    public Item getItemByIndex(int index) {
        Item item = items.get(index);
        items.remove(index);
        return item;
    }

    public void removeItemsWithoutLastOne() {
        if (items.size() > 1) {
            items.subList(0, items.size() - 1).clear();
        }
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
