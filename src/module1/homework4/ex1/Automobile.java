package module1.homework4.ex1;

public class Automobile extends Car {
    protected boolean isCruiseControl;

    public Automobile(boolean isClean, double width, double height, double length) {
        super(isClean, width, height, length);
    }

    public boolean isCruiseControl() {
        return isCruiseControl;
    }

    public void setCruiseControl(boolean cruiseControl) {
        isCruiseControl = cruiseControl;
    }
}
