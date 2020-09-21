package student_igors_bartkevics.lesson_14.homework.level_2_intern;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FruitStorageTest {

    FruitStorage storage = new FruitStorage();

    @Test
    public void greenColorPredicateTest() {
        List<Apple> greenApples =
        storage.findApples(storage.getAllApples(),new AppleGreenColorPredicate());
        assertEquals(greenApples.size(), 3);
    }

    @Test
    public void redColorPredicateTest() {
        List<Apple> redApples =
                storage.findApples(storage.getAllApples(),new AppleRedColorPredicate());
        assertEquals(redApples.size(), 3);
    }

    @Test
    public void heavyWeightPredicateTest() {
        List<Apple> redApples =
                storage.findApples(storage.getAllApples(),new AppleHeavyWeightPredicate());
        assertEquals(redApples.size(), 4);
    }

    @Test
    public void heavyLightWeightPredicateTest() {
        List<Apple> redApples =
                storage.findApples(storage.getAllApples(),new AppleLightWeightPredicate());
        assertEquals(redApples.size(), 4);
    }

}