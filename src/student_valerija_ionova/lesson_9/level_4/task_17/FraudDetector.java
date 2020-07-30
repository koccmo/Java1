package student_valerija_ionova.lesson_9.level_4.task_17;

//Task17 - Rule 1: трейдер по имени "Pokemon" является мошенником, все его транзакции должны быть отклонены.
//Task18 - Rule 2: все транзакции на сумму больше 1000000 должны быть отклонены.
//Task19 - Rule 3: все транзакции трейдеров из города "Сидней" должны быть отклонены.
//Task20 - Rule 4: все транзакции от трейдеров из страны Ямайка должны быть отклонены.
//Task21 - Rule 5: все транзакции трейдеров из Германии на сумму больше 1000 должны быть отклонены.

class FraudDetector {

    boolean isFraud(Transaction t) {
        return (isPokemon(t) || isTooBigAmount(t) || isSydney(t) || isJamaica(t) || isGermanAnd1000(t));
    }

    private boolean isPokemon(Transaction t) {
        return (t.getTrader().getFullName().equals("Pokemon"));
    }

    private boolean isTooBigAmount(Transaction t){
        return (t.getAmount() > 1000000);
    }

    private boolean isSydney(Transaction t){
        return(t.getTrader().getCity().equals("Sydney"));
    }

    private boolean isJamaica(Transaction t){
        return(t.getTrader().getCity().equals("Jamaica"));
    }

    private boolean isGermanAnd1000(Transaction t){
        return((t.getTrader().getCity().equals("German")) && (t.getAmount() > 1000));
    }



}