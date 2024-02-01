package module2.homework3.ex5.helperclasses;

public class Animal {
    private int bodyLength;
    private int tailLength;

    public Animal(int bodyLength, int tailLength) {
        this.bodyLength = bodyLength;
        this.tailLength = tailLength;
    }

    public int getBodyLength() {
        return bodyLength;
    }

    public int getTailLength() {
        return tailLength;
    }
}
