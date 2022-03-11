package roman.lesson_9.homework.day_6;



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
                "trader=" + trader.toString() +
                ", amount=" + amount +
                '}';
    }
}
