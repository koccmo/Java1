package student_roberts_kupcs.lesson_15.homework.level_2.Task_9;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
class FraudDetector {

    boolean isFraud(Trader trader) {

        if (compareTraderName(trader)
                ||
                (compareCity(trader))
        ) {
            return true;
        } else {
            return false;
        }
    }

    @CodeReviewComment(teacher = "Always return true?")
    boolean compareTraderName(Trader trader) {
        String traderName = trader.getFullName();
        if (traderName.equals("Pokemon")) {
        }
        return true;
    }

    boolean compareCity(Trader trader) {
        String cityName = trader.getCity();
        if (cityName.equals("Sidney")) {
            return true;
        } else {
            return false;
        }
    }
}
