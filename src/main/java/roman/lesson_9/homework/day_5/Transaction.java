package roman.lesson_9.homework.day_5;

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
