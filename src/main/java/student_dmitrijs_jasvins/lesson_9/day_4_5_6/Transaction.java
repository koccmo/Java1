package student_dmitrijs_jasvins.lesson_9.day_4_5_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
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
        return "Transaction : " +
                trader +
                "Amount - " + amount;
    }
}
