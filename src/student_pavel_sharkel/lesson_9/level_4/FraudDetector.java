package student_pavel_sharkel.lesson_9.level_4;

class FraudDetector {

    boolean isFraud(Trader trader) {
        if (isNameOk(trader)) {
            return true;
        } else {
            return false;
        }
        }

        boolean isNameOk(Trader trader) {
            String traderName = trader.getFullName();
            if (traderName.equals("Pokemon")) {
                return false;
            } else {
                return true;
            }
        }



}
