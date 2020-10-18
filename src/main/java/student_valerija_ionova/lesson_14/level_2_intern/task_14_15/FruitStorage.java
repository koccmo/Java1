package student_valerija_ionova.lesson_14.level_2_intern.task_14_15;

//Task1 найти все зеленые яблоки в своем складе.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FruitStorage {

    public List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }

    List <Apple> findByPredicate (List <Apple> inventory, ApplePredicate p){
        return inventory.stream()
                        .filter(apple -> p.test(apple))
                        .collect(Collectors.toList());
    };



}

//List<Apple> redApples = filterApples(..., new ApplePredicate() {
//    public boolean test(Apple apple) {
//        return "red".equals(apple.getColor());
//    }
//});
