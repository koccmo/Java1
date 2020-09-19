package student_valerija_ionova.lesson_14.level_2_intern;

class ApplePredicateLightApple implements ApplePredicate{


    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() < 150;
    }
}
