package student_volodya_danilin.lesson_15.level_2;

import java.util.List;

import teacher.codereview.CodeReview;

//Task_9
@CodeReview(approved = true)
class FraudDetector {

    private List<String> bannedNamesList;
    private List<String> bannedCitiesList;

    public FraudDetector(List<String> bannedNamesList, List<String> bannedCitiesList) {
        this.bannedNamesList = bannedNamesList;
        this.bannedCitiesList = bannedCitiesList;
    }

    public boolean isFraud(Trader trader) {
        return (isTraderNameBanned(trader)
        || isTraderCityBanned(trader));
    }

    private boolean isTraderNameBanned (Trader trader) {
        return bannedNamesList.contains(trader.getName());
    }

    private boolean isTraderCityBanned(Trader trader) {
        return bannedCitiesList.contains(trader.getCity());
    }

}
