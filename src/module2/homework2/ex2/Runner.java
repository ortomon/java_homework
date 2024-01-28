package module2.homework2.ex2;

import java.util.HashMap;

public class Runner {
    public static void main(String[] args) {
        Item item1 = new Item("Яблоко");
        Item item2 = new Item("Банан");
        Item item3 = new Item("Апельсин");

        HashMap<Item, Integer> map = new HashMap<>();
        map.put(item1, 1);
        map.put(item2, 2);
        map.put(item3, 3);

        System.out.println(map);
        Integer value = map.get(new Item("Апельсин"));
        System.out.println(value);
    }
}
