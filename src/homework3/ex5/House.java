package homework3.ex5;

public class House {
    private String street;
    private int number;

    public House(String street, int number) {
        this.street = street;
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public House setStreet(String street) {
        return new House(street, this.number);
    }

    public int getNumber() {
        return number;
    }

    public House setNumber(int number) {
        return new House(this.street, number);
    }

    @Override
    public String toString() {
        return "House{" +
                "street='" + street + '\'' +
                ", number=" + number +
                '}';
    }
}

