package student_jaroslav_brutan.lesson_9.day_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudDetector {

    boolean isFraud(Transaction t){

        return thiefPokemon(t) || moreThan1000000(t) || thiefCity(t) ||
                traderFromJamaica(t) || traderGermanyMoreThan1000(t);
    }

    private boolean thiefPokemon(Transaction t){

        return t.getTrader().getFullName().equals("Pokemon");
    }

    private boolean moreThan1000000(Transaction t){

        return t.getAmount() > 1000000;
    }

    private boolean thiefCity(Transaction t){

        return t.getTrader().getCity().equals("Sydney");
    }

    private boolean traderFromJamaica(Transaction t){

        return t.getTrader().getCountry().equals("Jamaica");
    }

    private boolean traderGermanyMoreThan1000(Transaction t){

        return (t.getTrader().getCountry().equals("Germany")) && t.getAmount() > 1000;
    }
}
