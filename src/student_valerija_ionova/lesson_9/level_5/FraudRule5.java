package student_valerija_ionova.lesson_9.level_5;


//Task 28 Rule 5: все транзакции трейдеров из Германии на сумму больше 1000 должны быть отклонены.

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudRule5 extends FraudRule{

    FraudRule5 (String fraudRule5){
        super (fraudRule5);
    }

    @Override
    boolean isFraud(Transaction t){
        return ((t.getTrader().getCity().equals("German")) && (t.getAmount() > 1000));
    }

}
