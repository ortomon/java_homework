package module2.Homework1.ex3;

public class Runner {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addItem(new Item("молоток"));
        warehouse.addItem(new Item[]{new Item("собака"), new Item("я")});
        System.out.println(warehouse.getEvenItems());
        System.out.println(warehouse.getItemByIndex(1));
        warehouse.removeItemsWithoutLastOne();
        System.out.println(warehouse.getItems());
    }
}
