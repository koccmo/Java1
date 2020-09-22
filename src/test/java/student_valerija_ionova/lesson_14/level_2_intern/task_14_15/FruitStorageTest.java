package student_valerija_ionova.lesson_14.level_2_intern.task_14_15;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FruitStorageTest {

    FruitStorage fruitStorage = new FruitStorage();

    @Test
    public void testGreenApples(){
        List<Apple> result = fruitStorage.findByPredicate(fruitStorage.getAllApples(), new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor().equals("green");
            }
        });
        assertEquals(3, result.size());
    }

    @Test
    public void testRedApples(){
        List <Apple> result = fruitStorage.findByPredicate(fruitStorage.getAllApples(), new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor().equals("red");
            }
        });
        assertEquals(3, result.size());
    }

    @Test
    public void testHeavyApples(){
        List <Apple> result = fruitStorage.findByPredicate(fruitStorage.getAllApples(), new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 150;
            }
        });
        assertEquals(4, result.size());
    }

    @Test
    public void testLightApples(){
        List <Apple> result = fruitStorage.findByPredicate(fruitStorage.getAllApples(), new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() < 150;
            }
        });
        assertEquals(4, result.size());
    }

}