package student_roberts_kupcs.lesson_14.homework.level_1_2.Task_1;

class AppleRedColorPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("red");
    }

}
