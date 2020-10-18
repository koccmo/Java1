package student_eduards_jasvins.lesson_14.day_2;

class ApplePredicateLightWeight implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return 150 < apple.getWeight();
    }
}
