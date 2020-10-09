package student_roberts_kupcs.lesson_14.homework.level_1.Task_1;

class AppleGreenColorPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("green");
    }
}
