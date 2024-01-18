package module1.homework2.ex4.shop;

public class Runner {
    public static void main(String[] args) {
        Item hammer = new Item(1000, "молот");
        Item screwdriver = new Item(50, "отвертка");
        Item copybook = new Item(30, "тетрадь");
        Item pen = new Item(10, "ручка");

        System.out.println(hammer.toString());

        Item[] vasiliyItem = {hammer, screwdriver};
        Item[] marianaItem = {copybook, pen};

        Worker vasiliy = new Worker("Василий", 30, "М", vasiliyItem);
        Worker mariana = new Worker("Марьяна", 25, "Ж", marianaItem);

        Worker[] pyaterochkaWorkers = {vasiliy, mariana};
        Shop pyaterochka = new Shop(pyaterochkaWorkers);

        //Вызвать у магазина печать
        pyaterochka.printWorkers();
        //Вызвать у каждого работника магазина хвастовство его вещами (достать работника из магазина)
        for (int i = 0; i < pyaterochkaWorkers.length; i++) {
            pyaterochka.worker[i].bragging();
        }
    }
}
