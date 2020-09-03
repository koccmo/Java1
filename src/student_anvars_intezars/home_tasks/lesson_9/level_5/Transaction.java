package student_anvars_intezars.home_tasks.lesson_9.level_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Transaction {

    private Trader trader;
    private int amount;

    Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    int getAmount () {
        return amount;
    }
}
