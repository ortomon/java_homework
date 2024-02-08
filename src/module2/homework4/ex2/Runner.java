package module2.homework4.ex2;

import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class Runner {
    public static void main(String[] args) {
        //Задание №2 - Сколько здесь "о" ?
        //Создать набор уникальных слов: "тонь", "тополь", "боль", "рой", "стройка"
        //Внутри одного стрима:
        //Посчитать количество букв "о" в одном слове
        //Посчитать сумму количества букв "о" во всех словах из набора
        //Если буквы "о" есть - напечатать количество букв "о", если нет выкинуть исключение
        //ожидаемый результат:
        // 6

        Set<String> words = Set.of("тонь", "тополь", "боль", "рой", "стройка");
//        Set<String> words = Set.of("тнь", "ль");

        words.stream()
                .map(word -> countLetterO(word))
                .reduce((a, b) -> a + b)
                .ifPresentOrElse(
                        System.out::println,
                        () -> {throw new RuntimeException("Буквы 'о' не найдены."); });
    }

    public static int countLetterO(String word) {
        return (int) word.chars()
                .filter(ch -> ch == 'о')
                .count();
    }
}
