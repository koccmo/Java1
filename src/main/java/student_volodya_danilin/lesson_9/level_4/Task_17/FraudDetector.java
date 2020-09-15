package student_volodya_danilin.lesson_9.level_4.Task_17;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudDetector {


    boolean isFraud(Transaction t) {
        boolean result = false;

        if (nameIsPokemon(t)) {
            result = true;
        }
        if (amountTooBig(t)) {
            result = true;
        }
        if (cityIsSydney(t)) {
            result = true;
        }
        if (countryIsJamaica(t)) {
            result = true;
        }

        return result;
    }

    boolean nameIsPokemon(Transaction t) {
        boolean result = false;
        if (t.getTrader().getFullName().equals("Pokemon")) {
            result = true;
            System.out.println("Trader Pokemon is not allowed!");
        }
        return result;
    }

    boolean amountTooBig(Transaction t) {
        boolean result = false;
        if (t.getAmount() > 1000000) {
            result = true;
            System.out.println("Transaction amount is too big!\nLimit : 1 000 000$");
        }
        return result;
    }

    boolean cityIsSydney(Transaction t) {
        boolean result = false;
        if (t.getTrader().getCity().equals("Sydney")) {
            result = true;
            System.out.println("Traders from Sydney banned!");
        }
        return result;
    }

    boolean countryIsJamaica(Transaction t) {
        boolean result = false;
        if (t.getTrader().getCountry().equals("Jamaica")) {
            result = true;
            System.out.println("Traders from Jamaica banned!");
        }
    return result;
    }

    boolean germanOverLimit(Transaction t) {
        boolean result = false;
        if (t.getTrader().getCountry().equals("Germany")
           && t.getAmount() > 1000) {
            result = true;
            System.out.println("German traders have limit 1000$");
        }
        return result;
    }


}