package module2.Homework1.ex1;

import module2.Homework1.ex1.animals.Animal;
import module2.Homework1.ex1.animals.Bird;
import module2.Homework1.ex1.animals.Dog;
import module2.Homework1.ex1.animals.Tiger;

import java.util.ArrayList;
import java.util.List;

public class Zoo<T extends Animal, S extends Animal, V extends Animal> {
    private T animal1;
    private S animal2;
    private V animal3;

    public Zoo(T animal1, S animal2, V animal3) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.animal3 = animal3;
    }

    public T getAnimal1() {
        return animal1;
    }

    public S getAnimal2() {
        return animal2;
    }

    public V getAnimal3() {
        return animal3;
    }
}