package student_aleksandra_maksimovic.lesson_9.level_6;

/*
Вынесем код первого правила автоматического определения мошенничества в отдельный класс.

Создайте класс FraudRule1:

class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        // Перенесите сюда код реализации первого правила из класса FraudDetector
    }

}

Напишите югит тесты для класса FraudRule1!
 */
class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getFullName().equals("Pokemon");
    }

}
