package module2.homework3.ex3;

public class Runner {
    public static void main(String[] args) {
        //Задание №3: Поиск пары с помощью гадания
        //Создать функциональный интерфейс гадание, который на вход принимает аргумент любого типа,
        //на выход возвращает да/нет.
        //Создать с помощью лямбд выражений:
        //ромашку: принимает имя, возвращает да если в имени четное кол-во букв, нет если нечетное
        //бабку гадалку: принимает Человека(возраст,рост),
        //возвращает да - если возраст + рост больше 210, нет - если меньше или равно

        FortuneTelling<String> camomile = name -> name.length() % 2 == 0;

        FortuneTelling<Human> grannyFortuneTeller = human ->
                (human.getAge() + human.getHeight()) > 210;


        Human alina = new Human("Alina", 20, 162);
        Human danila = new Human("Danila", 30, 190);

        boolean camomileResultA = camomile.predict(alina.getName());
        boolean camomileResultD = camomile.predict(danila.getName());

        boolean grandmaDivinationResultA = grannyFortuneTeller.predict(alina);
        boolean grandmaDivinationResultD = grannyFortuneTeller.predict(danila);
    }
}
