package homework4.ex1;

public class Bus extends Car {
    protected int maxNumberPassengers;

    public Bus(boolean isClean, double width, double height, double length) {
        super(isClean, width, height, length);
    }

    public int getMaxNumberPassengers() {
        return maxNumberPassengers;
    }

    public void setMaxNumberPassengers(int maxNumberPassengers) {
        this.maxNumberPassengers = maxNumberPassengers;
    }
}
