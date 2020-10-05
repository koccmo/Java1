package student_roberts_kupcs.lesson_14.homework.level_1.Task_1;

import java.util.ArrayList;
import java.util.List;

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

    public List<Apple> findApplesByColor(List<Apple> green,String color) {
        List<Apple> apples = new ArrayList<>();
        for (Apple apple : green) {
            if (color.equals(apple.getColor())) {
                apples.add(apple);
            }
        }
        return apples;
    }

}
