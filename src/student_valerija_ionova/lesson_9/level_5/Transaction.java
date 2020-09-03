package student_valerija_ionova.lesson_9.level_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Transaction {

    private Trader trader;
    private int amount;

    Transaction (Trader trader, int amount){
        this.trader = trader;
        this.amount = amount;
    }

    Trader getTrader(){
        return trader;
    }

    int getAmount(){
        return amount;
    }
}
