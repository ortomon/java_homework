package module2.homework3.ex2;

import module2.homework3.ex2.fruit.Apple;
import module2.homework3.ex2.fruit.Apricot;

public class Runner {
    public static void main(String[] args) {
        //Задание №2: Сад
        //Создать два фрукта: яблоко, абрикос. (Без полей)
        //Создать функциональный интерфейс сад, который умеет выращивать фрукты.
        //Метод ничего не принимает.
        //Создать с помощью лямбд выражений 2 фермы: яблочная, абрикосовая.
        //Яблочная ферма должна отдавать яблоки(не фрукты!), абрикосовая абрикосы(не фрукты!).

        Garden<Apple> appleGarden = () -> new Apple();
        Garden<Apricot> apricotGarden = () -> new Apricot();

        Apple apple = appleGarden.growFruit();
        Apricot apricot = apricotGarden.growFruit();
    }
}
