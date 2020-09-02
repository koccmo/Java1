package student_volodya_danilin.lesson_9.level_4.Task_17;

class Transaction {

    private Trader trader;
    private int amount;

    Transaction(Trader t, int amount) {
        this.trader = t;
        this.amount = amount;
    }

    int getAmount() {
        return this.amount;
    }

    Trader getTrader() {
        return  this.trader;
    }

    String getCountry(Transaction t) {
        return t.trader.getCountry();
    }

}