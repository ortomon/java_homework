package module2.homework3.ex5;

import module2.homework3.ex5.helperclasses.Animal;
import module2.homework3.ex5.helperclasses.Boat;

public class Runner {
    public static void main(String[] args) {
        //Задание №5: универсальная линейка
        //Создать функциональный интерфейс линейка: принимает в себя любой тип, возвращает Integer
        //Создать с помощью лямбд выражений:
        //Измеритель лодок: на вход лодка(длина), возвращает длину лодки
        //Измеритель животных: на вход животное(длина тела, длина хвоста),
        //возвращает сумму длин тела и хвоста

        Ruller<Boat> boatRuller = boat -> boat.getLenth();
        Ruller<Animal> animalRuller = animal -> animal.getBodyLength() + animal.getTailLength();

        boatRuller.measure(new Boat(5));
        animalRuller.measure(new Animal(5, 6));
    }
}
