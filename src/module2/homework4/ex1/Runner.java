package module2.homework4.ex1;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        //Задание №1 - Список спец номеров
        //Создать класс машина. У машины есть номер.
        //Создать 50 машин с номерами а0[01-50]ан799 (где [01-50] - это все значения от 01 до 50)
        //Создать 50 машин с номерами к0[01-50]се178
        //Соединить машины в единый стрим
        //Машины, с номерами 04[0-9] - это спец номера (врачи)
        //оставить только те машины, которые обладают спец номерами
        //Получить из машин номера
        //Соединить в единую строку, с разделителем в " ," - самостоятельное изучение
        //ожидаемый финал
        //"a040ан1799, a041ан799, ... , k048се178, k049се178"

        Stream.concat(generateAN799Cars(), generateSE178Cars())
                .filter(number -> number.charAt(2) == '4')
                .forEach(number -> System.out.print(number + ", "));
    }

    public static Stream<String> generateAN799Cars() {
        return generateCars("а", "ан799", 50);
    }

    public static Stream<String> generateSE178Cars() {
        return generateCars("к", "се178", 50);
    }

    public static Stream<String> generateCars(String number1, String number2, int limit) {
        AtomicInteger counter = new AtomicInteger();
        return Stream.generate(() -> new Car(number1 + String.format("%03d", counter.addAndGet(1)) + number2))
                .limit(limit)
                .map(Car::getNumber);
    }
}
