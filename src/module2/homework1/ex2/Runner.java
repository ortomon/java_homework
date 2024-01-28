package module2.homework1.ex2;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(5, 2, 4);
        List<Integer> list2 = List.of(7, 10);

        ArrayList<Integer> arrayList1 = new ArrayList<>(list1);
        ArrayList<Integer> arrayList2 = new ArrayList<>(list2);
        ArrayList<Integer> finalArrayList = new ArrayList<>();

        finalArrayList.addAll(arrayList1);
        finalArrayList.addAll(arrayList2);
        System.out.println(finalArrayList);

        finalArrayList.remove(2);
        System.out.println("после удаления 3 элемента: " + finalArrayList);
        System.out.println("индекс числа 10: " + finalArrayList.indexOf(10));
    }
}
