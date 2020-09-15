package student_aleksandra_maksimovic.lesson_9.level_6;

class Transaction {

    private Trader trader;
    private int amount;

    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public Trader getTrader()
    {
        return trader;
    }
    public int getAmount() { return amount;}

    @Override
    public String toString() {
        return (trader.toString() + "\nTransaction amount: " + amount + " EUR");

    }
}
