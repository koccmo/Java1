package student_igors_bartkevics.lesson_14.homework.level_2_intern;

class AppleHeavyWeightGreenPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150 && apple.getColor().equals("green");
    }
}
