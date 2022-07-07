package roman.lesson_10.day_x.task_1;

public class StrategyPrize {
    private Prize prize;

    public StrategyPrize(Prize prize) {
        this.prize = prize;
    }

    public double makePrizeForHoliday(double standardPrize) {
        return prize.doPrize(standardPrize);
    }
}
