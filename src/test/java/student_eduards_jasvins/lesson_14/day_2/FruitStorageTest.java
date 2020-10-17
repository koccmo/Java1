package student_eduards_jasvins.lesson_14.day_2;

import org.junit.Test;

import java.util.List;


import static org.junit.Assert.*;

public class FruitStorageTest {

    FruitStorage storage = new FruitStorage();


    @Test
    public void findApplesGreen() {
        ApplePredicate predicate = new ApplePredicateGreenColor();
        assertEquals(3, storage.findApple(storage.getAllApples(), predicate).size());
    }

    @Test
    public void findApplesRed() {
        ApplePredicate predicate = new ApplePredicateRedColor();
        assertEquals(3, storage.findApple(storage.getAllApples(), predicate).size());
    }

    @Test
    public void findApplesHeavyWeight() {
        ApplePredicate predicate = new ApplePredicateHeavyWeight();
        assertEquals(4, storage.findApple(storage.getAllApples(), predicate).size());
    }

    @Test
    public void findApplesLightWeight() {
        ApplePredicate predicate = new ApplePredicateLightWeight();
        assertEquals(4, storage.findApple(storage.getAllApples(), predicate).size());

    }

    @Test
    public  void anonymousGreen() {
        List<Apple> greenApples = storage.findApple(storage.getAllApples(), new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "green".equals(apple.getColor());

            }
        });
        assertEquals(greenApples.size(), 3);
    }

    @Test
    public  void anonymousRed() {
        List<Apple> redApples = storage.findApple(storage.getAllApples(), new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "red".equals(apple.getColor());

            }
        });
        assertEquals(redApples.size(), 3);
    }

    @Test
    public  void anonymousGreenWeight() {
        List<Apple> greenApples = storage.findApple(storage.getAllApples(), new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return 150 > apple.getWeight();

            }
        });
        assertEquals(greenApples.size(), 4);
    }

    @Test
    public  void anonymousRedWeight() {
        List<Apple> redApples = storage.findApple(storage.getAllApples(), new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return 150 < apple.getWeight();

            }
        });
        assertEquals(redApples.size(), 4);
    }

    @Test
    public void usingLambdaGreen() {
        List <Apple> greenApples = storage.findApple(storage.getAllApples(),
                (Apple apple) -> "green".equals(apple.getColor()));
        assertEquals(greenApples.size(), 3);
     }

    @Test
    public void usingLambdaRed() {
        List <Apple> greenApples = storage.findApple(storage.getAllApples(),
                (Apple apple) -> "red".equals(apple.getColor()));
        assertEquals(greenApples.size(), 3);
    }

    @Test
    public void usingLambdaGreenWeight() {
        List <Apple> greenApples = storage.findApple(storage.getAllApples(),
                (Apple apple) -> 150 > apple.getWeight());
        assertEquals(greenApples.size(), 4);
    }

    @Test
    public void usingLambdaRedWeight() {
        List <Apple> greenApples = storage.findApple(storage.getAllApples(),
                (Apple apple) -> 150 < apple.getWeight());
        assertEquals(greenApples.size(), 4);
    }

}