package module2.homework3.ex1;

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

import java.time.LocalDateTime;
import java.util.Objects;

public class Feedback {
    private int id;
    private String text;
    private int numberLikes;
    private LocalDateTime dateTime;

    public Feedback(int id, String text, int numberLikes, LocalDateTime dateTime) {
        this.id = id;
        this.text = text;
        this.numberLikes = numberLikes;
        this.dateTime = dateTime;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Feedback feedback = (Feedback) object;
        return id == feedback.id && numberLikes == feedback.numberLikes && Objects.equals(text, feedback.text) && Objects.equals(dateTime, feedback.dateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text, numberLikes, dateTime);
    }

    public int getNumberLikes() {
        return numberLikes;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                ", numberLikes=" + numberLikes +
//                ", dateTime=" + dateTime +
                '}';
    }

    public static class Node {
        private Feedback feedback;
        private Node next = null;

        public Node(Feedback feedback) {
            this.feedback = feedback;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Feedback getFeedback() {
            return feedback;
        }

        public Node getNext() {
            return next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "feedback=" + feedback +
                    ", next=" + next +
                    '}';
        }
    }
}
