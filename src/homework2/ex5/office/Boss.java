package homework2.ex5.office;

public class Boss {
    String name;

    public Boss(String name) {
        this.name = name;
    }

    public void talk(String name) {
        System.out.printf("Босс: %s быстрее!\n", name);
    }
}
