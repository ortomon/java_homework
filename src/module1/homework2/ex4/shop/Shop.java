package module1.homework2.ex4.shop;

public class Shop {
    Worker[] worker;

    public Shop(Worker[] worker) {
        this.worker = worker;
    }

    public void printWorkers() {
        for (Worker element : worker) {
            System.out.printf("%s: %s лет, %s, список вещей: %s, %s\n", element.name, element.age, element.sex,
                    element.workerItem[0], element.workerItem[1]);
        }
    }
}