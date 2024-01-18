package module1.homework4.ex2;

public class Plane implements Flyable {
    private int countPassengers;

    public Plane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public void fly() throws FlyException {
        if (countPassengers < 0) {
            throw new FlyException("Ошибка: пассажиров в самолете меньше 0");
        } else {
            System.out.println("самолет летит");
        }
    }
}
