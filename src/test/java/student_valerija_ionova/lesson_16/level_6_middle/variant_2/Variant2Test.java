package student_valerija_ionova.lesson_16.level_6_middle.variant_2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Variant2Test {

    @Test
    public void test1 (){
        int [] test = {2, 0, 2};
        Variant2 variant = new Variant2(test);
        assertEquals(2, variant.getVolumeOfWater());
    }

    @Test
    public void test2 (){
        int [] test = {3, 0, 2, 0, 4};
        Variant2 variant = new Variant2(test);
        assertEquals(7, variant.getVolumeOfWater());
    }

    @Test
    public void test3 (){
        int [] test = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        Variant2 variant = new Variant2(test);
        assertEquals(6, variant.getVolumeOfWater());
    }

    @Test
    public void test4 (){
        int [] test = {1, 0, 7, 2, 1, 6, 1, 4, 2, 5, 2, 9};
        Variant2 variant = new Variant2(test);
        assertEquals(34, variant.getVolumeOfWater());
    }

}