package student_igors_bartkevics.lesson_14.homework.level_1_intern;

import org.junit.Test;

import static org.junit.Assert.*;

public class FruitStorageTest {

    FruitStorage storage = new FruitStorage();

    @Test
    public void getAllGreenApplesTest() {
        assertEquals(storage.getAllGreenApples().size(), 3);
    }

}