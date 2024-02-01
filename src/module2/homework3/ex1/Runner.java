package module2.homework3.ex1;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.TreeSet;

public class Runner {
    public static void main(String[] args) {
        //Задание №1: сортировка отзывов
        //Создать класс отзыв с полями: id отзыва, текст отзыва, количество лайков,
        // дата + время отзыва (LocalDateTime)
        //Создать коллекцию, которая хранит отсортированные отзывы по лайкам и дата + время отзыва.
        //Уникальность определяется на основе сортировки.
        //Создать comparator через лямбда выражение, для сортировки отзывов:
        //сначала у кого больше лайков, если лайки совпадают, то сначала идут более новые

        //Пример, отсортированный :
        //          (id, текст, кол-во лайков, дата+время)
        //отзыв №1: 1, отличный товар, 200, 25.01.2024 13:37
        //отзыв №2: 2, так себе товар, 100, 25.01.2024 16:37
        //отзыв №3: 3, плохой товар, 100, 25.01.2024 13:37

        Comparator<Feedback> feedbackComparator = (o1, o2) -> {
            return o2.getNumberLikes() - o1.getNumberLikes();
        };

        TreeSet<Feedback> feedbacks = new TreeSet<>(feedbackComparator);

        LocalDateTime localDateTime1 = LocalDateTime.of(2024, 1, 25, 13, 37);
        LocalDateTime localDateTime2 = LocalDateTime.of(2024, 1, 25, 16, 37);
        LocalDateTime localDateTime3 = LocalDateTime.of(2024, 1, 25, 13, 37);
        LocalDateTime localDateTime4 = LocalDateTime.of(2024, 1, 25, 10, 37);

        Feedback feedback1 = new Feedback(1, "отличный товар", 200, localDateTime1);
        Feedback feedback2 = new Feedback(2, "так себе товар", 100, localDateTime2);
        Feedback feedback3 = new Feedback(3, "плохой товар", 100, localDateTime3);
        Feedback feedback4 = new Feedback(4, "hz", 300, localDateTime4);

        feedbacks.add(feedback1);
        feedbacks.add(feedback2);
        feedbacks.add(feedback3);
        feedbacks.add(feedback4);
        System.out.println(feedbacks);
    }
}
