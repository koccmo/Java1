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
        List<Apple> heavyApples =
                storage.findApples(storage.getAllApples(),new AppleHeavyWeightPredicate());
        assertEquals(heavyApples.size(), 4);
    }

    @Test
    public void lightWeightPredicateTest() {
        List<Apple> lightApples =
                storage.findApples(storage.getAllApples(),new AppleLightWeightPredicate());
        assertEquals(lightApples.size(), 4);
    }

    @Test
    public void heavyWeightGreenApplePredicateTest() {
        List<Apple> heavyWeightGreenApples =
                storage.findApples(storage.getAllApples(),new AppleHeavyWeightGreenPredicate());
        assertEquals(heavyWeightGreenApples.size(), 1);
    }

    @Test
    public void filterGreenApplesUsingAnonymousClassTest() {
        List<Apple> greenApples =
                storage.findApples(storage.getAllApples(),new ApplePredicate() {
                    public boolean test(Apple apple) {
                        return "green".equals(apple.getColor());
                    }
                });
        assertEquals(greenApples.size(), 3);
    }

    @Test
    public void filterRedApplesUsingAnonymousClassTest() {
        List<Apple> redApples =
                storage.findApples(storage.getAllApples(),new ApplePredicate() {
                    public boolean test(Apple apple) {
                        return "red".equals(apple.getColor());
                    }
                });
        assertEquals(redApples.size(), 3);
    }

    @Test
    public void filterHeavyWeightApplesUsingAnonymousClassTest() {
        List<Apple> heavyWeightApples =
                storage.findApples(storage.getAllApples(),new ApplePredicate() {
                    public boolean test(Apple apple) {
                        return apple.getWeight() > 150;
                    }
                });
        assertEquals(heavyWeightApples.size(), 4);
    }

    @Test
    public void filterLightWeightApplesUsingAnonymousClassTest() {
        List<Apple> lightWeightApples =
                storage.findApples(storage.getAllApples(),new ApplePredicate() {
                    public boolean test(Apple apple) {
                        return apple.getWeight() < 150;
                    }
                });
        assertEquals(lightWeightApples.size(), 4);
    }

    @Test
    public void filterGreenApplesUsingLambdaExpressionTest() {
        List<Apple> greenApples =
                storage.findApples(storage.getAllApples(),
                    (Apple apple) -> "green".equals(apple.getColor()));

        assertEquals(greenApples.size(), 3);
    }

    @Test
    public void filterRedApplesUsingLambdaExpressionTest() {
        List<Apple> redApples =
                storage.findApples(storage.getAllApples(),
                    (Apple apple) -> "red".equals(apple.getColor()));
        assertEquals(redApples.size(), 3);
    }

    @Test
    public void filterHeavyWeightApplesUsingLambdaExpressionTest() {
        List<Apple> heavyWeightApples =
                storage.findApples(storage.getAllApples(),
                        (Apple apple) -> apple.getWeight() > 150);

        assertEquals(heavyWeightApples.size(), 4);
    }

    @Test
    public void filterLightWeightApplesUsingLambdaExpressionTest() {
        List<Apple> lightWeightApples =
                storage.findApples(storage.getAllApples(),
                        (Apple apple) -> apple.getWeight() < 150 );

        assertEquals(lightWeightApples.size(), 4);
    }

}