package student_anvars_intezars.home_tasks.lesson_14;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FruitStorageTest {

    @Test
    public void findingOnlyGreensApplesTest() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> differentApples = new ArrayList<>();
        differentApples.add(new Apple("green", 200));
        differentApples.add(new Apple("green", 90));
        differentApples.add(new Apple("yellow", 50));
        differentApples.add(new Apple("yellow", 170));
        List<Apple> result = fruitStorage.getAllGreenApples(differentApples);
        assertEquals(2, result.size());
    }

    @Test
    public void findingOnlyRedApplesTest() {
        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> differentApples = new ArrayList<>();
        differentApples.add(new Apple("green", 200));
        differentApples.add(new Apple("green", 90));
        differentApples.add(new Apple("yellow", 50));
        differentApples.add(new Apple("yellow", 170));
        differentApples.add(new Apple("red", 160));
        List<Apple> result = fruitStorage.getAllRedApples(differentApples);
        assertEquals(1, result.size());
    }

}