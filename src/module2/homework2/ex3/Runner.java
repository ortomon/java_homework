package module2.homework2.ex3;

import java.util.HashMap;

public class Runner {
    public static void main(String[] args) {
        HashMap<Detail, Integer> map = new HashMap<>();

        map.put(new Detail("Пила"), 1);
        map.put(new Detail("Молоток"), 2);
        map.put(new Detail("отвертка"), 3);

        System.out.println(map);
    }
}
