package module1.homework2.ex4.shop;

public class Item {
    int weight;
    String name;

    public Item (int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
