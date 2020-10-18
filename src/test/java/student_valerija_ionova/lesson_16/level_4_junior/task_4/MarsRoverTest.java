package student_valerija_ionova.lesson_16.level_4_junior.task_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class MarsRoverTest {

    @Test
    public void acceptanceTest1 (){
        MarsRover marsRover = new MarsRover();
        String result = marsRover.move(1, 2, 'N', "LMLMLMLMM");
        String expectedResult = "1 3 N";
        assertEquals(expectedResult, result);
    }

    @Test
    public void acceptanceTest2 (){
        MarsRover marsRover = new MarsRover();
        String result = marsRover.move(3, 3, 'E', "MMRMMRMRRM");
        String expectedResult = "5 1 E";
        assertEquals(expectedResult, result);
    }

    @Test
    public void test3 (){
        MarsRover marsRover = new MarsRover();
        String result = marsRover.move(0, 7, 'E', "RMMLMMRMMMRMLMM");
        String expectedResult = "1 0 S";
        assertEquals(expectedResult, result);
    }

    @Test
    public void test4 (){
        MarsRover marsRover = new MarsRover();
        String result = marsRover.move(3, 1, 'W', "MMRMLM");
        String expectedResult = "0 2 W";
        assertEquals(expectedResult, result);
    }


}