package student_valerija_ionova.lesson_9.level_5;

//Task24 Rule 1: трейдер по имени "Pokemon" является мошенником, все его транзакции должны быть отклонены.

class FraudRule1 extends FraudRule{

    FraudRule1(String fraudRule1){
        super(fraudRule1);
    }

    @Override
    boolean isFraud(Transaction t){
        return t.getTrader().getFullName().equals("Pokemon");
    }

}
