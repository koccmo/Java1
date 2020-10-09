package student_roberts_kupcs.lesson_14.homework.level_1_2.Task_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class FruitStorageTest {
    FruitStorage fruitStorage = new FruitStorage();

    @Test
    public void greenApplesTest() {

        assertEquals(fruitStorage.findApplesByColor(fruitStorage.getAllApples(), "green").size(), 3);

    }

    @Test
    public void findRedApples() {
        assertEquals(fruitStorage.findApplesByColor(fruitStorage.getAllApples(), "red").size(), 3);
    }

    @Test
    public void findApplesByWeightTest() {
        assertEquals(fruitStorage.findApplesByWeight(fruitStorage.getAllApples(), 150).size(), 4);
    }

}