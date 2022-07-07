package roman.lesson_10.day_x.task_1;

public class StrategyPrizeDemo {
    public static void main(String[] args) {
        StrategyPrize easterPrize = new StrategyPrize(new EasterPrize());
        System.out.println("Prize on Easter holiday = " + easterPrize.makePrizeForHoliday(100.00));

        StrategyPrize christmas = new StrategyPrize(new Christmas());
        System.out.println("Prize on Christmas holiday = " + christmas.makePrizeForHoliday(100.00));
    }
}
