package student_valerija_ionova.lesson_9.level_6;


//Task 28 Rule 5: все транзакции трейдеров из Германии на сумму больше 1000 должны быть отклонены.

public class FraudRule5 extends FraudRule {

    FraudRule5 (String fraudRule5){
        super (fraudRule5);
    }

    @Override
    boolean isFraud(Transaction t){
        return ((t.getTrader().getCity().equals("German")) && (t.getAmount() > 1000));
    }

}
