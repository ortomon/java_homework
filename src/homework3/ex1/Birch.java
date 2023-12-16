package homework3.ex1;

public class Birch extends Deciduous {
    public Birch(double age) {
        super(age);
    }

    @Override
    public void bloom() {
        super.bloom();
        System.out.println("источает аллергены");
    }
}
