package student_valerija_ionova.lesson_9.level_6;

//Task 25 Rule 2: все транзакции на сумму больше 1000000 должны быть отклонены.

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudRule2 extends FraudRule {

    FraudRule2 (String fraudRule2){
        super (fraudRule2);
    }

    @Override
    boolean isFraud(Transaction t){
        return (t.getAmount() > 1000000);
    }

}
