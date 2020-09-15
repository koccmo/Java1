package student_jaroslav_brutan.lesson_9.day_5;

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
}
