package homework2.ex4.shop;

public class Worker {
    String name;
    int age;
    String sex;
    Item[] workerItem ;

    public Worker (String name, int age,  String sex, Item[] workerItem) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.workerItem = workerItem;
    }

    public void bragging() {
        for (int i = 0; i < workerItem.length; i++) {
           System.out.printf("%s: смотрите какая у меня вещь - %s\n",  name, workerItem[i]);
        }
    }
}

