package module1.homework3.ex4;

public class LotteryTicket {
    protected static int counter;
    protected int winning;
    protected static int finalWinning;

    public LotteryTicket() {
        counter++;

        if (counter % 100 == 0) {
            winning = 5_000;
            finalWinning += 5_000;
        } else if (counter % 10 == 0) {
            winning = 100;
            finalWinning += 100;
        }
    }

    public void checkYourLuck() {
        System.out.println("Сумма выигрыша билета: " + winning);
        System.out.println("Общая сумма выигрыша: " + finalWinning);
    }
}
