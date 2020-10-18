package student_jaroslav_brutan.lesson_14.day_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class FruitStorageTest {

    FruitStorage fruitStorage = new FruitStorage();

    @Test
    public void findAllGreenApples(){
       assertEquals(fruitStorage.findApplesByColor(fruitStorage.getAllApples(),"green").size(),3);
    }

    @Test
    public void findAllRedApples(){
        assertEquals(fruitStorage.findApplesByColor(fruitStorage.getAllApples(),"red").size(),3);
    }

    @Test
    public void findYellowApples(){
        assertEquals(fruitStorage.findApplesByColor(fruitStorage.getAllApples(),"yellow").size(),2);
    }

    @Test
    public void findApplesByWeight(){
        assertEquals(fruitStorage.findApplesByWeight(fruitStorage.getAllApples(),120).size(),4);
    }

}