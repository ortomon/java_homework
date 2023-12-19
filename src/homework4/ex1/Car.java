package homework4.ex1;

public abstract class Car {
    private boolean isClean;
    private double width;
    private double height;
    private double length;

    public Car(boolean isClean, double width, double height, double length) {
        this.isClean = isClean;
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Car{" +
                "isClean=" + isClean +
                ", width=" + width +
                ", height=" + height +
                ", length=" + length +
                '}';
    }
}
