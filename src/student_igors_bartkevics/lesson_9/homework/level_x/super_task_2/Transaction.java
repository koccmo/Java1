package student_igors_bartkevics.lesson_9.homework.level_x.super_task_2;

public class Transaction {

    private Trader trader;
    private int amount;

    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                trader.toString() +
                ", amount=" + amount +
                '}';
    }
}
