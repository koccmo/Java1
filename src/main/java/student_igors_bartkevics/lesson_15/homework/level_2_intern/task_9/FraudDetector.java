package student_igors_bartkevics.lesson_15.homework.level_2_intern.task_9;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudDetector {

    boolean isFraud(Trader trader) {
        return (isTraderPokemon(trader)
                ||
                isTraderFromSidney(trader));

    }

    boolean isTraderPokemon(Trader trader) {
        String traderName = trader.getFullName();
        return traderName.equals("Pokemon");
    }

    boolean isTraderFromSidney(Trader trader) {
        String cityName = trader.getCity();
        return cityName.equals("Sidney");
    }

}
