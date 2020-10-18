package student_valerija_ionova.lesson_16.level_3_junior.task_3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MoveLogicTest {

    @Test
    public void acceptanceTest1 (){
        RobotStartPositionParameters robotStartPositionParameters =
                new RobotStartPositionParameters(new MoveInformation("1 2 N"), "LMLMLMLMM");
        Challenge moveLogic = new Challenge("5 5", robotStartPositionParameters);
        List <MoveInformation> result = new ArrayList<>();
        result.add (new MoveInformation("1 3 N"));
        assertEquals(result, moveLogic.marsRoverMovements());
    }

    @Test
    public void acceptanceTest2 (){
        RobotStartPositionParameters robotStartPositionParameters =
                new RobotStartPositionParameters(new MoveInformation("3 3 E"), "MMRMMRMRRM");
        Challenge moveLogic = new Challenge("5 5", robotStartPositionParameters);
        List <MoveInformation> result = new ArrayList<>();
        result.add (new MoveInformation("5 1 E"));
        assertEquals(result, moveLogic.marsRoverMovements());
    }

    @Test
    public void test3 (){
        RobotStartPositionParameters robotStartPositionParameters =
                new RobotStartPositionParameters(new MoveInformation("0 7 E"), "RMMLMMRMMMRMLMM");
        Challenge moveLogic = new Challenge("7 8", robotStartPositionParameters);
        List <MoveInformation> result = new ArrayList<>();
        result.add (new MoveInformation("1 0 S"));
        assertEquals(result, moveLogic.marsRoverMovements());
    }

    @Test
    public void test4 (){
        RobotStartPositionParameters robotStartPositionParameters =
                new RobotStartPositionParameters(new MoveInformation("3 1 W"), "MMRMLM");
        Challenge moveLogic = new Challenge("4 4", robotStartPositionParameters);
        List <MoveInformation> result = new ArrayList<>();
        result.add (new MoveInformation("0 2 W"));
        assertEquals(result, moveLogic.marsRoverMovements());
    }

    @Test
    public void smallMars (){
        RobotStartPositionParameters robotStartPositionParameters =
                new RobotStartPositionParameters(new MoveInformation("0 0 N"), "RMLRRMMM");
        Challenge moveLogic = new Challenge("0 0", robotStartPositionParameters);
        List <MoveInformation> result = new ArrayList<>();
        result.add (new MoveInformation("0 0 S"));
        assertEquals(result, moveLogic.marsRoverMovements());
    }

    @Test
    public void awayFromBoard (){
        RobotStartPositionParameters robotStartPositionParameters =
                new RobotStartPositionParameters(new MoveInformation("0 0 W"), "MMMMMMMMRMM");
        Challenge moveLogic = new Challenge("3 3", robotStartPositionParameters);
        List <MoveInformation> result = new ArrayList<>();
        result.add (new MoveInformation("0 2 N"));
        assertEquals(result, moveLogic.marsRoverMovements());
    }

    @Test
    public void twoRobots (){
        RobotStartPositionParameters robotStartPositionParameters1 =
                new RobotStartPositionParameters(new MoveInformation("1 2 N"), "LMLMLMLMM");
        RobotStartPositionParameters robotStartPositionParameters2 =
                new RobotStartPositionParameters(new MoveInformation("3 3 E"), "MMRMMRMRRM");
        Challenge moveLogic = new Challenge("5 5", robotStartPositionParameters1, robotStartPositionParameters2);
        List <MoveInformation> result = new ArrayList<>();
        result.add (new MoveInformation("1 3 N"));
        result.add (new MoveInformation("5 1 E"));
        assertEquals(result, moveLogic.marsRoverMovements());
    }

    @Test
    public void twoRobotsWithoutAccidents (){
        RobotStartPositionParameters robotStartPositionParameters1 =
                new RobotStartPositionParameters(new MoveInformation("1 1 N"), "MMRMMMRM");
        RobotStartPositionParameters robotStartPositionParameters2 =
                new RobotStartPositionParameters(new MoveInformation("3 3 S"), "MRMMMRMMRM");
        Challenge moveLogic = new Challenge("5 5", robotStartPositionParameters1, robotStartPositionParameters2);
        List <MoveInformation> result = new ArrayList<>();
        result.add (new MoveInformation("2 2 S"));
        result.add (new MoveInformation("4 4 E"));
        assertEquals(result, moveLogic.marsRoverMovements());
    }

}