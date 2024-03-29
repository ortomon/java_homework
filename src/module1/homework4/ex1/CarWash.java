package module1.homework4.ex1;

public class CarWash {
    public int washingCar(Car car) {
        // Делает машину чистой.
        car.setClean(true);
        // Возвращает стоимость помывки.
        return cost(car);
    }

    public int washingCar(Car[] cars) {
        int totalCost = 0;
        for (Car car : cars) {
            totalCost += washingCar(car);
        }
        return totalCost;
    }

    private static int cost(Car car) {
        return (car.getLength() > 6 || car.getHeight() > 2.5 || car.getWidth() > 2) ? 4000 : 2000;
    }
}
