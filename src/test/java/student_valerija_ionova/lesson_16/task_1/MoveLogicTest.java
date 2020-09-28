package student_valerija_ionova.lesson_16.task_1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoveLogicTest {

    @Test
    public void acceptanceTest1 (){
        MoveLogic moveLogic = new MoveLogic("5 5", new MoveInformation("1 2 N"), "LMLMLMLMM");
        MoveInformation result = new MoveInformation("1 3 N");
        assertEquals(result, moveLogic.marsRoverMovement());
    }

    @Test
    public void acceptanceTest2 (){
        MoveLogic moveLogic = new MoveLogic("5 5", new MoveInformation("3 3 E"), "MMRMMRMRRM");
        MoveInformation result = new MoveInformation("5 1 E");
        assertEquals(result, moveLogic.marsRoverMovement());
    }

    @Test
    public void test3 (){
        MoveLogic moveLogic = new MoveLogic("7 8", new MoveInformation("0 7 E"), "RMMLMMRMMMRMLMM");
        MoveInformation result = new MoveInformation("1 0 S");
        assertEquals(result, moveLogic.marsRoverMovement());
    }

    @Test
    public void test4 (){
        MoveLogic moveLogic = new MoveLogic("4 4", new MoveInformation("3 1 W"), "MMRMLM");
        MoveInformation result = new MoveInformation("0 2 W");
        assertEquals(result, moveLogic.marsRoverMovement());
    }

    @Test
    public void smallMars (){
        MoveLogic moveLogic = new MoveLogic("0 0", new MoveInformation("0 0 N"), "RMLRRMMM");
        MoveInformation result = new MoveInformation("0 0 S");
        assertEquals(result, moveLogic.marsRoverMovement());
    }

}