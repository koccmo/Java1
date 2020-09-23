package student_valerija_ionova.lesson_14.level_2_intern.task_7_13;

//Создайте реализацию интерфейса ApplePredicate для выбора:
//- зелёных яблок
//- красных яблок
//- тяжелых яблок ( > 150 г.)
//- лёгких яблок ( < 150 г.)

class ApplePredicateImplGreenApple implements ApplePredicate{


    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("green");
    }
}
