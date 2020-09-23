package student_valerija_ionova.lesson_14.level_2_intern.task_16_17;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FruitStorageTest {

    FruitStorage fruitStorage = new FruitStorage();

    @Test
    public void testAllGreen(){
        List<Apple> result = fruitStorage.findByPredicate(fruitStorage.getAllApples(),
                (Apple apple) -> apple.getColor().equals("green"));
        assertEquals(3, result.size());
    }

    @Test
    public void testAllRed(){
        List <Apple> result = fruitStorage.findByPredicate(fruitStorage.getAllApples(),
                (Apple apple) -> apple.getColor().equals("red"));
    }

    @Test
    public void testAllHeavy(){
        List<Apple> result = fruitStorage.findByPredicate(fruitStorage.getAllApples(),
                (Apple apple) -> apple.getWeight() > 150);
        assertEquals(4, result.size());
    }

    @Test
    public void testAllLight(){
        List <Apple> result = fruitStorage.findByPredicate(fruitStorage.getAllApples(),
                (Apple apple) -> apple.getWeight() < 150);
    }

}