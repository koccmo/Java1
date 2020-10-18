package student_eduards_jasvins.lesson_14.day_1;

import org.junit.Test;
import student_eduards_jasvins.lesson_14.day_1.FruitStorage;

import static org.junit.Assert.*;

public class FruitStorageTest {

    FruitStorage storage = new FruitStorage();

    @Test
    public void getAppleByColorGreen() {
        assertEquals(3, storage.getAppleByColor("green").size());
    }

    @Test
    public void getAppleByColorYellow() {
        assertEquals(2, storage.getAppleByColor("yellow").size());
    }

    @Test
    public void getAppleByColorYRed() {
        assertEquals(3, storage.getAppleByColor("red").size());
    }


    @Test
    public void findApplesByWeight() {
        assertEquals(4, storage.findApplesByWeight(150).size());
    }
}