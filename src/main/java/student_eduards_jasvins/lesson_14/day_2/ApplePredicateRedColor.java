package student_eduards_jasvins.lesson_14.day_2;

class ApplePredicateRedColor implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "red".equals(apple.getColor());
    }
}
