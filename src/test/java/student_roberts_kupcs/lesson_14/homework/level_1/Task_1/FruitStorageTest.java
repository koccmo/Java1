package student_roberts_kupcs.lesson_14.homework.level_1.Task_1;

import org.junit.Test;
import static org.junit.Assert.*;

public class FruitStorageTest {
    FruitStorage fruitStorage = new FruitStorage();

    @Test
    public void greenApplesTest() {

        assertEquals(fruitStorage.findApplesByColor(fruitStorage.getAllApples(),"green").size(),3);

    }

}