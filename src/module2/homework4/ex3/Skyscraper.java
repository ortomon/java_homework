package module2.homework4.ex3;

import java.util.Objects;

public class Skyscraper {
    private String name;
    private int height;

    public Skyscraper(String name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Skyscraper that = (Skyscraper) object;
        return height == that.height && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height);
    }

    @Override
    public String toString() {
        return "Skyscraper{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }

    public int getHeight() {
        return height;
    }
}
