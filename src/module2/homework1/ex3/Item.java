package module2.homework1.ex3;

public class Item {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" + "name='" + name + '\'' + '}';
    }
}
