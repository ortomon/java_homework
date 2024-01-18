package module1.homework3.ex1;

public abstract class Deciduous extends Tree {
    public Deciduous(double age) {
        super(age);
    }

    public void nowLeavesOnTree() {
        System.out.println("есть листья на дереве сейчас");
    }

    public void leavesFallingOff() {
        System.out.println("листья пропадают с дерева");
    }

    public void bloom() {
        System.out.println("листья появляются");
    }
}
