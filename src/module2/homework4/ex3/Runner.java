package module2.homework4.ex3;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Runner {
    public static void main(String[] args) {
        //Задание №3 - Небоскребы, небоскребы, а я...
        //Дано: Небоскреб - имя небоскреба, его высота в метрах.
        //Необходимо создать небоскребы:
        //1 Всемирный торговый центр 1 - 541м
        //2 Шанхайская башня - 632м
        // 3 бурдж-халифа - 828м
        //4 Международный финансовый центр Пинань - 599м
        //5 Абрадж аль-Бейт - 601м
        //6 Всемирный центр Лотте - 555м

        //Занести данный список в List! Дважды положить бурдж халифа в лист.
        //С помощью стримов:
        //Убрать дубликаты
        //(РАЗНЫЕ СТРИМЫ)
        //Вывести только первые три небоскреба.
        //Вывести самый высокий небоскреб.
        //Вывести те небоскребы, которые выше километра.
        //Если выше нет, то вывести на экран: небоскреба выше километра - нет.

        List<Skyscraper> skyscrapers = List.of(
                new Skyscraper("Всемирный торговый центр 1", 541),
                new Skyscraper("Шанхайская башня", 632),
                new Skyscraper("Бурдж-Халифа", 828),
                new Skyscraper("Международный финансовый центр Пинань", 599),
                new Skyscraper("Абрадж аль-Бейт", 601),
                new Skyscraper("Всемирный центр Лотте", 555),
                new Skyscraper("Бурдж-Халифа", 828)
        );

        List<Skyscraper> uniqueSkyscrapers = skyscrapers.stream().distinct().toList();
        uniqueSkyscrapers.stream().limit(3).forEach(System.out::println);
        Comparator<Skyscraper> skyscraperComparator = Comparator.comparingInt(Skyscraper::getHeight);
        Optional<Skyscraper> maxSkyscraper = uniqueSkyscrapers.stream().max(skyscraperComparator);
        System.out.println("самый высокий небоскреб: " + maxSkyscraper);

        uniqueSkyscrapers.stream()
                .filter(skyscraper -> check(skyscraper))
                .map(skyscraper -> skyscraper.toString())
                .reduce((a, b) -> a + ", " + b)
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("Небоскреба выше километра - нет."));
    }

    public static boolean check(Skyscraper skyscraper) {
        return skyscraper.getHeight() > 1000;
    }
}
