package student_igors_bartkevics.lesson_9.homework.level_6_task_30_to_33;

class FraudRule1 extends FraudRule {
    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    @Override
    //isPokemon
    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        String traderFullName = trader.getFullName();
        return traderFullName.equals("Pokemon");
    }
}
