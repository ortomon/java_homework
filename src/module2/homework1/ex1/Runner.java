package module2.homework1.ex1;

import module2.homework1.ex1.animals.Bird;
import module2.homework1.ex1.animals.Dog;
import module2.homework1.ex1.animals.Tiger;

public class Runner {
    public static void main(String[] args) {
        Zoo<Tiger, Bird, Dog> zoo = new Zoo<>(new Tiger(), new Bird(), new Dog());
        zoo.getAnimal1().growl();
        zoo.getAnimal2().fly();
        zoo.getAnimal3().bark();
    }
}
