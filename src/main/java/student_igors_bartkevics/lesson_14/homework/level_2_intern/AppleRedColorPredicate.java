package student_igors_bartkevics.lesson_14.homework.level_2_intern;

class AppleRedColorPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("red");
    }
}
