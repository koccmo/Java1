package student_aleksandra_maksimovic.lesson_14.level_1;

import teacher.lesson_14.lessoncode.Fruit;

import java.util.ArrayList;
import java.util.List;

public class FruitStorage {
    private List<Apple> inventory;

    public FruitStorage() {
        inventory = new ArrayList<Apple>();
    }

    public void addApple(Apple apple) {
        inventory.add(apple);
    }

    public List<Apple> findApplesByColor(String color) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if(apple.getColor().equals(color)) {
                result.add(apple);
            }
        }
        return result;
    }

    public List<Apple> findApplesByMinWeight(int minWeight) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if(apple.getWeight() > minWeight) {
                result.add(apple);
            }
        }
        return result;
    }

    public List<Apple> findApples(ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if(p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
