package student_jaroslav_brutan.lesson_14.day_2;

public class AppleGreenHeavyPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple){
        return apple.getColor().equals("green") && apple.getWeight() > 150;
    }
}
