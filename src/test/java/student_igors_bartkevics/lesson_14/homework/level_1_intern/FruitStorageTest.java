package student_igors_bartkevics.lesson_14.homework.level_1_intern;

import org.junit.Test;

import static org.junit.Assert.*;

public class FruitStorageTest {

    FruitStorage storage = new FruitStorage();

    @Test
    public void findGreenApplesTest() {
        assertEquals(storage.findApplesByColor(storage.getAllApples(), "green").size(), 3);
    }

    @Test
    public void findRedApplesTest() {

        assertEquals(storage.findApplesByColor(storage.getAllApples(), "red").size(), 3);
    }

    @Test
    public void findGreenApplesByColorTest() {

        assertEquals(storage.findApplesByColor(storage.getAllApples(), "yellow").size(), 2);
    }

    @Test
    public void findApplesByWeightTest() {

        assertEquals(storage.findApplesByWeight(storage.getAllApples(), 150).size(), 4);
    }



}