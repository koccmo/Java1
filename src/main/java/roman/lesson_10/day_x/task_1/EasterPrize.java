package roman.lesson_10.day_x.task_1;

public class EasterPrize implements Prize {

    @Override
    public double doPrize(double prize) {
        return prize * 0.9;
    }
}
