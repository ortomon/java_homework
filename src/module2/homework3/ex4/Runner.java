package module2.homework3.ex4;

import module2.homework3.ex4.fuel.Uranium;
import module2.homework3.ex4.fuel.Wood;

public class Runner {
    public static void main(String[] args) {
        //Задание №4: Гори ясно!
        //Создать функциональный интерфейс сжигание, ничего не возвращает, принимает аргумент
        //любого типа.
        //Создать с помощью лямбд выражений:
        //атомный реактор: принимает в себя уран, печатает на экран: зеленый свет вокруг!
        //костер: принимает в себя дерево, печатает на экран: желто-красный свет вокруг!

        Burn<Uranium> atomicReactor = (uranium) -> printText("зеленый свет вокруг!");
        Burn<Wood> bonfire = (wood) -> printText("желто-красный свет вокруг!");
        atomicReactor.burn(new Uranium());
        bonfire.burn(new Wood());
    }

    public static void printText(String text) {
        System.out.println(text);
    }
}
