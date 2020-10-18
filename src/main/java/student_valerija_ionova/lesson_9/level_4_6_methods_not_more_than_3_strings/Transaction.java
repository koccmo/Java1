package student_valerija_ionova.lesson_9.level_4_6_methods_not_more_than_3_strings;

class Transaction {

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
        return "Transaction: " + trader + ", amount=" + amount;
    }
}
