package student_valerija_ionova.lesson_9.level_6;

//Task27 Rule 4: все транзакции от трейдеров из страны Ямайка должны быть отклонены.

class FraudRule4 extends FraudRule{

    FraudRule4 (String fraudRule4){
        super (fraudRule4);
    }

    @Override
    boolean isFraud(Transaction t){
        return t.getTrader().getCity().equals("Jamaica");
    }

}
