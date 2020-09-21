package student_igors_bartkevics.lesson_14.homework.level_1_intern;

import org.junit.Test;

import static org.junit.Assert.*;

public class FruitStorageTest {

    FruitStorage storage = new FruitStorage();

    @Test
    public void findGreenApplesTest() {
        assertEquals(storage.findGreenApples(storage.getAllApples()).size(), 3);
    }

    @Test
    public void findRedApplesTest() {

        assertEquals(storage.findRedApples(storage.getAllApples()).size(), 3);
    }

}