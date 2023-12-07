package book;

import javax.xml.namespace.QName;

public class Book {
    //Создать класс книга с атрибутами: Имя книги, имя автора, количество страниц, документальный (да/нет)
    //Методы класса книга:
    //1. Вывод общего количества строк в книге - без аргументов:
    //Результат: Выводит на экран количество страниц * 40
    //2. Вывод общего количество строк в книге (количество строк в странице),
    //Результат: Выводит на экран количество страниц * количество строк в странице
    //Вывод информации о книге без аргументов
    //Результат: [Имя книги] от [Имя автора] - [документальная/недокументальная]:

    String name;
    String author;
    int namber;
    boolean documental;

    public Book (String name, String author, int namber, boolean documental) {
        this.name = name;
        this.author = author;
        this.namber = namber;
        this.documental = documental;
    }

    public void NumberOfPages40() {
        System.out.println(this.namber * 40);
    }
}
