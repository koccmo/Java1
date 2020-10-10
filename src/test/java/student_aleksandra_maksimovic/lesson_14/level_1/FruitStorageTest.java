package student_aleksandra_maksimovic.lesson_14.level_1;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FruitStorageTest {
    FruitStorage storage;

    @Before
    public void init() {
        storage = new FruitStorage();
        storage.addApple(new Apple("red", 100));
        storage.addApple(new Apple("red", 160));
        storage.addApple(new Apple("red", 200));
        storage.addApple(new Apple("green", 200));
        storage.addApple(new Apple("green", 90));
        storage.addApple(new Apple("green", 50));
        storage.addApple(new Apple("yellow", 50));
        storage.addApple(new Apple("yellow", 170));
    }

    @Test
    public void test_filterApplesByColor_1() {
        assertEquals(storage.findApplesByColor("green").size(), 3);
    }

    @Test
    public void test_filterApplesByColor_2() {
        assertEquals(storage.findApplesByColor("yellow").size(), 2);
    }

    @Test
    public void test_findApplesByWeight_1() {
        assertEquals(storage.findApplesByMinWeight(150).size(), 4);
    }

    @Test
    public void test_findApples_AppleGreenColorPredicate_1() {
        assertEquals(storage.findApples(new AppleGreenColorPredicate()).size(), 3);
    }

    @Test
    public void test_findApples_AppleRedColorPredicate_1() {
        assertEquals(storage.findApples(new AppleRedColorPredicate()).size(), 3);
    }

    @Test
    public void test_findApples_AppleHeavyWeightPredicate_1() {
        assertEquals(storage.findApples(new AppleHeavyWeightPredicate()).size(), 4);
    }

    @Test
    public void test_findApples_AppleLightWeightPredicate_1() {
        assertEquals(storage.findApples(new AppleLightWeightPredicate()).size(), 4);
    }

    @Test
    public void test_findApples_AppleGreenAndHeavyWeightPredicate_1() {
        assertEquals(storage.findApples(new AppleGreenAndHeavyWeightPredicate()).size(), 1);
    }

    @Test
    public void test_findApples_Anonymous_1() {
        List<Apple> redApples = storage.findApples(new ApplePredicate() {
            public boolean test(Apple apple) {
                return "red".equals(apple.getColor());
            }
        });
        assertEquals(redApples.size(), 3);
    }

    @Test
    public void test_findApples_Anonymous_2() {
        List<Apple> redApples = storage.findApples(new ApplePredicate() {
            public boolean test(Apple apple) {
                return "green".equals(apple.getColor());
            }
        });
        assertEquals(redApples.size(), 3);
    }

    @Test
    public void test_findApples_Anonymous_3() {
        List<Apple> redApples = storage.findApples(new ApplePredicate() {
            public boolean test(Apple apple) {
                return apple.getWeight() > 150;
            }
        });
        assertEquals(redApples.size(), 4);
    }

    @Test
    public void test_findApples_Anonymous_4() {
        List<Apple> redApples = storage.findApples(new ApplePredicate() {
            public boolean test(Apple apple) {
                return apple.getWeight() < 150;
            }
        });
        assertEquals(redApples.size(), 4);
    }

    @Test
    public void test_findApples_lambda_1() {
        List<Apple> redApples = storage.findApples((Apple apple) -> "red".equals(apple.getColor()));
        assertEquals(redApples.size(), 3);
    }

    @Test
    public void test_findApples_lambda_2() {
        List<Apple> redApples = storage.findApples((Apple apple) -> "green".equals(apple.getColor()));
        assertEquals(redApples.size(), 3);
    }

    @Test
    public void test_findApples_lambda_3() {
        List<Apple> redApples = storage.findApples((Apple apple) -> apple.getWeight() > 150);
        assertEquals(redApples.size(), 4);
    }

    @Test
    public void test_findApples_lambda_4() {
        List<Apple> redApples = storage.findApples((Apple apple) -> apple.getWeight() < 150);
        assertEquals(redApples.size(), 4);
    }




}