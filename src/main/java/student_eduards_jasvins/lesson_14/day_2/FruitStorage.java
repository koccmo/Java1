package student_eduards_jasvins.lesson_14.day_2;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class FruitStorage {

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

    public List<Apple> findApple(List <Apple> inventory, ApplePredicate predicate) {
        return inventory.stream()
                .filter(apple -> predicate.test(apple))
                .collect(Collectors.toList());

    }
}
