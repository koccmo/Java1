package student_jaroslav_brutan.lesson_14.day_2;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

public class FruitStorageTest {

    FruitStorage fruitStorage = new FruitStorage();

    @Test
    public void testFoGreenColorPredicate(){
        List<Apple> allGreenApples =
                fruitStorage.findApples(fruitStorage.getAllApples(),new AppleGreenColorPredicate());
                assertEquals(allGreenApples.size(),3);
    }

    @Test
    public void testForRedColorPredicate(){
        List<Apple> allRedApples =
                fruitStorage.findApples(fruitStorage.getAllApples(),new AppleRedColorPredicate());
                assertEquals(allRedApples.size(),3);
    }

    @Test
    public void testForHeavyWeightPredicate(){
        List<Apple> allHeavyApples =
                fruitStorage.findApples(fruitStorage.getAllApples(),new AppleHeavyWeightPredicate());
        assertEquals(allHeavyApples.size(),4);
    }

    @Test
    public void testForLightWeightPredicate(){
        List<Apple> allLightApples =
                fruitStorage.findApples(fruitStorage.getAllApples(),new AppleLightWeightPredicate());
                assertEquals(allLightApples.size(),4);
    }

    @Test
    public void testForGreenHeavyPredicate(){
        List<Apple> greenHeavyApple =
                fruitStorage.findApples(fruitStorage.getAllApples(),new AppleGreenHeavyPredicate());
                assertEquals(greenHeavyApple.size(),1);
    }

    @Test
    public void findGreenApplesWithAnonymousClass(){
        List<Apple> findGreenApples = fruitStorage.findApples(fruitStorage.getAllApples(), new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor().equals("green");
            }
        });
        assertEquals(findGreenApples.size(),3);
    }

    @Test
    public void findRedApplesWithAnonymousClass(){
        List<Apple> findRedApples = fruitStorage.findApples(fruitStorage.getAllApples(), new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor().equals("red");
            }
        });
        assertEquals(findRedApples.size(),3);
    }

    @Test
    public void findHeavyApplesWithAnonymousClass(){
        List<Apple> heavyApples = fruitStorage.findApples(fruitStorage.getAllApples(), new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 150;
            }
        });
        assertEquals(heavyApples.size(),4);
    }

    @Test
    public void findLightApplesWithAnonymousClass(){
        List<Apple> lightApples = fruitStorage.findApples(fruitStorage.getAllApples(), new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() < 150;
            }
        });
        assertEquals(lightApples.size(),4);
    }

    @Test
    public void greenApplesLambdaTest() {
        List<Apple> allGreenApples = fruitStorage.findApples(fruitStorage.getAllApples(),
                (Apple apple) -> apple.getColor().equals("green"));
        assertEquals(allGreenApples.size(),3);
    }

    @Test
    public void redApplesLambdaTest(){
        List<Apple> allRedApples = fruitStorage.findApples(fruitStorage.getAllApples(),
                (Apple apple) -> apple.getColor().equals("green"));
        assertEquals(allRedApples.size(),3);
    }

    @Test
    public void heavyApplesLambdaTest(){
        List<Apple> allHeavyApples = fruitStorage.findApples(fruitStorage.getAllApples(),
                (Apple apple) -> apple.getWeight() > 150);
        assertEquals(allHeavyApples.size(),4);
  }

  @Test
    public void lightApplesLambdaTest(){
        List<Apple> allLightApples = fruitStorage.findApples(fruitStorage.getAllApples(),
                (Apple apple) -> apple.getWeight() < 150);
        assertEquals(allLightApples.size(),4);
  }
}