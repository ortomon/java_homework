package module1.homework3.ex2;

public class ElectronicBoard {
    private String name;
    private int width;
    private int length;
    private int height;

    public ElectronicBoard(String name, int width, int length, int height) {
        this.name = name;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    @Override
    public String toString() {
        return "ElectronicBoard{" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", length=" + length +
                ", height=" + height +
                '}';
    }
}
