package module2.homework3.ex2;

import module2.homework3.ex2.fruit.Fruit;

@FunctionalInterface
public interface Garden<T extends Fruit> {
    T growFruit();
}
