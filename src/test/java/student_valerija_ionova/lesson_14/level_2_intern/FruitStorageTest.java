package student_valerija_ionova.lesson_14.level_2_intern;

import org.junit.Test;

import static org.junit.Assert.*;

public class FruitStorageTest {

    FruitStorage fruitStorage = new FruitStorage();

    @Test
    public void testAppleGreen(){
        ApplePredicate p = new ApplePredicateImplGreenApple();
        assertEquals(3, fruitStorage.findApples(fruitStorage.getAllApples(), p).size());
    }

    @Test
    public void testAppleRed(){
        ApplePredicate p = new ApplePredicateRedApples();
        assertEquals(3, fruitStorage.findApples(fruitStorage.getAllApples(), p).size());
    }

    @Test
    public void testAppleHeavy(){
        ApplePredicate p = new ApplePredicateHeavyApples();
        assertEquals(4, fruitStorage.findApples(fruitStorage.getAllApples(), p).size());
    }

    @Test
    public void testAppleLight(){
        ApplePredicate p = new ApplePredicateLightApple();
        assertEquals(4, fruitStorage.findApples(fruitStorage.getAllApples(), p).size());
    }

    @Test
    public void testAppleHeavyAndGreen(){
        ApplePredicate p = new ApplePredicateHeavyGreenApple();
        assertEquals(1, fruitStorage.findApples(fruitStorage.getAllApples(), p).size());
    }

}