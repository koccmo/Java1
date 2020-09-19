package student_valerija_ionova.lesson_14.level_1_intern.task_1;

import org.junit.Test;


import static org.junit.Assert.*;

public class FruitStorageTest {

    FruitStorage fruitStore = new FruitStorage();

    @Test
    public void testFruitStorageGetAllGreenApples(){
        assertEquals(3, fruitStore.getAllApplesByColor("green").size());
    }

    @Test
    public void testFruitStorageGetAllRedApples(){
        assertEquals(3, fruitStore.getAllApplesByColor("red").size());
    }

    @Test
    public void testFruitStorageGetAllYellowApples(){
        assertEquals(2, fruitStore.getAllApplesByColor("yellow").size());
    }

}