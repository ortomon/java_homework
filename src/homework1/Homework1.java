package homework1;

public class Homework1 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
    }

    public static void ex1() {
        String name = "     ПЕтРов Олег Иванович     ";
        name = name.trim().toUpperCase();

        if (name.contains("ова ")) {
            System.out.printf("ex1: Уважаемая %s\n", name);
        } else if (name.contains("ов ")) {
            System.out.printf("ex1: Уважаемый %s\n", name);
        } else {
            System.out.printf("ex1: Неизвестное лицо %s\n", name);
        }
    }

    public static void ex2() {
        //Количество топлива
        double fuel = 10;
        //Проверка двигателя
        boolean isEngineWork = true;
        //Проверка отсутствия ошибок (false - ошибок нет)
        boolean hasErrors = false;
        //Датчики давления шин
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;

        if (fuel >= 10 && isEngineWork && (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4) && !hasErrors) {
            System.out.println("ex2: Машина работает");
        } else {
            System.out.println("ex2: Машина не работает");
        }
    }

    public static void ex3() {
        String simply = "this is simply. This is my favorite song.";
        String newSimply = simply.replaceAll("this is", "those are").replaceAll("This is", "Those are");
        int value2 = newSimply.indexOf('o', newSimply.indexOf('o') + 1);
        System.out.printf("ex3: индекс = %s\n", value2);
    }

    public static void ex4() {
        int sausagePrice = 800;
        int soldSausage = 2000;
        int sausageCostPrice;

        int hamPrice = 350;
        int soldHam = 8511;
        int hamCostPrice = 275;

        int neckPrice = 500;
        int soldNeck = 6988;
        int neckCostPrice;

        int tax;

        //расчет себестоимости sausage
        if (soldSausage < 1000) {
            sausageCostPrice = 412;
        } else if (1000 <= soldSausage && soldSausage < 2000) {
            sausageCostPrice = 408;
        } else {
            sausageCostPrice = 404;
        }

        //расчет себестоимости neck
        if (soldNeck < 500) {
            neckCostPrice = 311;
        } else {
            neckCostPrice = 299;
        }

        //Финансовые показатели
        int income = (sausagePrice * soldSausage) + (hamPrice * soldHam) + (neckPrice * soldNeck);
        int expenses = (sausageCostPrice * soldSausage) + (hamCostPrice * soldHam) + (neckCostPrice * soldNeck) + 1_000_000;
        int profitBeforeTaxes = income - expenses;

        //расчет налога
        if (profitBeforeTaxes > 2_000_000) {
            tax = (1_000_000 / 100 * 8) + (999_999 / 100 * 10) + ((profitBeforeTaxes - 2_000_000) / 100 * 13);
        } else if (1_000_001 <= profitBeforeTaxes && profitBeforeTaxes <= 2_000_000) {
            tax = (1_000_000 / 100 * 8) + ((profitBeforeTaxes - 1_000_001) / 100 * 10);
        } else {
            tax = profitBeforeTaxes / 100 * 8;
        }

        int profitAfterTaxes = profitBeforeTaxes - tax;
        System.out.printf("ex4: прибыль после налогов = %s\n", profitAfterTaxes);
    }
}