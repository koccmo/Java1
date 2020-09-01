package student_volodya_danilin.lesson_9.level_4.Task_17;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Transaction {

    private Trader trader;
    private int amount;

    Transaction(Trader t) {
        this.trader = t;
    }

    int getAmount() {
        return this.amount;
    }

    Trader getTrader() {
        return  this.trader;
    }

    void prepareDeposit(Trader t, int amount) {
        this.trader = t;
        this.amount = amount;
    }

}