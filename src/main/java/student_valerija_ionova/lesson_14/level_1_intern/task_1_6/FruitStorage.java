package student_valerija_ionova.lesson_14.level_1_intern.task_1_6;

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

    List <Apple> getAllApplesByColor(String color){
        return getAllApples().stream()
                             .filter(apple -> apple.getColor().equals(color))
                             .collect(Collectors.toList());
    }

    List <Apple> getAllApplesByWeight(int weight){
        return getAllApples().stream()
                .filter(apple -> apple.getWeight() > weight)
                .collect(Collectors.toList());
    }

}
