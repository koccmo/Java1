package student_valerija_ionova.lesson_14.level_2_intern;

class ApplePredicateHeavyApples implements ApplePredicate{


    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
