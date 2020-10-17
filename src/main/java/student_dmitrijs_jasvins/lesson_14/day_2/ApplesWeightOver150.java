package student_dmitrijs_jasvins.lesson_14.day_2;

public class ApplesWeightOver150 implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
