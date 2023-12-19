package homework3;

import homework3.ex1.*;
import homework3.ex2.*;
import homework3.ex3.*;
import homework3.ex4.*;
import homework3.ex5.*;

public class Homework3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        ex2();
    }

    public static void ex1() {
        Tree[] trees = {new Birch(5), new Spruce(3), new Pine(1)};
        //средний возраст
        double averageAge = 0;

        for (Tree tree : trees) {
            averageAge += tree.getAge() / trees.length;
        }

        System.out.printf("средний возраст: %d", (int) averageAge);
    }

    public static void ex2() {
        Factory factory = new Factory();

        Samsung samsung = new Samsung();
        factory.assemble(samsung);

        Iphone iphone = new Iphone();
        factory.assemble(iphone);

        System.out.println("Assembled Samsung Galaxy: " + samsung);
        System.out.println("Assembled iPhone 15: " + iphone);

        //Задача: Фабрика телефонов
        //Создать 2 типа телефонов и комплектующих к ним.

        //При печати телефона должны показываться все свойства телефона и вложенных объектов.

        //1 тип: Samsung galaxy. Имеет операционную систему Android, плату j-108(размер (ширина Х длина Х высота) 10х12х13),
        //камеру Samsung(20x zoom).
        //2 Тип: Iphone 15. Имеет операционную систему Ios, плату 7uik(размер 15х12х13),
        //камеру iphone(15x zoom, есть вспышка).
        //
        //Создать фабрику, которая заполняет созданный телефон деталями
        //При создании телефона в нем нет комплектующих, как будто пустой пластиковый каркас,
        //но при этом модель телефона уже есть.
        //
        //
        //В фабрике должно быть два публичных метода с одним названием:
        //один будет собирать iphone, второй будет собирать samsung.
        //В данном методе создать два телефона, собрать их, распечатать.
    }

    public static void ex3() {
        new Pyramid1().print();
    }

    public static void ex4() {
        //Создать 100 билетов и проверить по каждому удачу.
        LotteryTicket[] lotteryTickets = new LotteryTicket[100];

        for (int i = 0; i < lotteryTickets.length; i++) {
            lotteryTickets[i] = new LotteryTicket();
            lotteryTickets[i].checkYourLuck();
        }
    }

    public static void ex5() throws CloneNotSupportedException {
        //Задача*:
        //класс House (название улицы, номер дома)
        //Создать иммутабельный класс City (наименование города, и массив домов).
        //Переопределить вывод в текст - чтобы выводило имя города, и все дома
        //
        //Создать два дома, создать город с массивом созданных домов
        //При получении домов из массива, и изменении данных (например замена улицы) у дома,
        //у домов внутри city ничего не поменяется. Т.е. при вызове toString, будут старые имена улицы

        //задача: есть класс House и класс City. В классе House есть атрибуты - название улицы и номер дома.
        //В классе City есть атрибуты название города и и массив домов из класса House.
        //Создадим два дома (house1 и house2), создадим город с массивом созданных домов.
        //При получении дома из массива, и изменении данных (например название улицы) у дома,
        //у домов внутри city ничего не поменяется. Т.е. при вызове toString, будут старые имена улицы

        //есть класс House

        House[] houses = {new House("Lenina", 15), new House("Pushkina", 45)};
        City city = new City("Gotham", houses);

        House[] cityHouses = city.getHouses();
        House firstCityHouse = cityHouses[0];

        firstCityHouse.setStreet("Sverdlova");
        firstCityHouse.setNumber(10);

        System.out.println(city);
    }
}