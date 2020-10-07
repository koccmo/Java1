package student_valerija_ionova.lesson_16.level_7_senior;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SkylineProblemTest {

    @Test
    public void testOneBuilding(){
        int [][] coordinates = {{1, 5, 11}};
        SkylineProblem skylineProblem = new SkylineProblem(coordinates);
        List<ResultCoordinates> expectedResult = new ArrayList<>();
        expectedResult.add(new ResultCoordinates(1, 11));
        expectedResult.add(new ResultCoordinates(5, 0));
        assertEquals(expectedResult, skylineProblem.getSilhouetteOfSkylines());
    }

    @Test
    public void testOneBuilding2(){
        int [][] coordinates = {{3, 9, 9}};
        SkylineProblem skylineProblem = new SkylineProblem(coordinates);
        List<ResultCoordinates> expectedResult = new ArrayList<>();
        expectedResult.add(new ResultCoordinates(3, 9));
        expectedResult.add(new ResultCoordinates(9, 0));
        assertEquals(expectedResult, skylineProblem.getSilhouetteOfSkylines());
    }

    @Test
    public void testTwoBuildings(){
        int [][] coordinates = {{1, 7, 2}, {3, 5, 6}};
        SkylineProblem skylineProblem = new SkylineProblem(coordinates);
        List<ResultCoordinates> expectedResult = new ArrayList<>();
        expectedResult.add(new ResultCoordinates(1, 2));
        expectedResult.add(new ResultCoordinates(3, 6));
        expectedResult.add(new ResultCoordinates(5, 2));
        expectedResult.add(new ResultCoordinates(7, 0));
        assertEquals(expectedResult, skylineProblem.getSilhouetteOfSkylines());
    }

    @Test
    public void testTwoBuildingsTwoSilhouettes(){
        int [][] coordinates = {{1, 5, 11}, {6, 7, 11}};
        SkylineProblem skylineProblem = new SkylineProblem(coordinates);
        List<ResultCoordinates> expectedResult = new ArrayList<>();
        expectedResult.add(new ResultCoordinates(1, 11));
        expectedResult.add(new ResultCoordinates(5, 0));
        expectedResult.add(new ResultCoordinates(6, 11));
        expectedResult.add(new ResultCoordinates(7, 0));
        assertEquals(expectedResult, skylineProblem.getSilhouetteOfSkylines());
    }

    @Test
    public void testTwoBuildingsOneSilhouette(){
        int [][] coordinates = {{1, 5, 11}, {5, 7, 11}};
        SkylineProblem skylineProblem = new SkylineProblem(coordinates);
        List<ResultCoordinates> expectedResult = new ArrayList<>();
        expectedResult.add(new ResultCoordinates(1, 11));
        expectedResult.add(new ResultCoordinates(7, 0));
        assertEquals(expectedResult, skylineProblem.getSilhouetteOfSkylines());
    }

    @Test
    public void testFourBuildings(){
        int [][] coordinates = {{1, 3, 8}, {2, 4, 6}, {4, 6, 4}, {8, 9, 1}};
        SkylineProblem skylineProblem = new SkylineProblem(coordinates);
        List<ResultCoordinates> expectedResult = new ArrayList<>();
        expectedResult.add(new ResultCoordinates(1, 8));
        expectedResult.add(new ResultCoordinates(3, 6));
        expectedResult.add(new ResultCoordinates(4, 4));
        expectedResult.add(new ResultCoordinates(6, 0));
        expectedResult.add(new ResultCoordinates(8, 1));
        expectedResult.add(new ResultCoordinates(9, 0));
        assertEquals(expectedResult, skylineProblem.getSilhouetteOfSkylines());
    }

    @Test
    public void testOneBigBuildingAndLotsSmall(){
        int [][] coordinates = {{1, 20, 8}, {2, 4, 6}, {4, 6, 4}, {8, 9, 1}, {10, 7, 8}, {15, 16, 2}, {19, 20, 5}};
        SkylineProblem skylineProblem = new SkylineProblem(coordinates);
        List<ResultCoordinates> expectedResult = new ArrayList<>();
        expectedResult.add(new ResultCoordinates(1, 8));
        expectedResult.add(new ResultCoordinates(20, 0));
        assertEquals(expectedResult, skylineProblem.getSilhouetteOfSkylines());
    }


    @Test
    public void testManyBuildings1(){
        int [][] coordinates = {{2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8}};
        SkylineProblem skylineProblem = new SkylineProblem(coordinates);
        List<ResultCoordinates> expectedResult = new ArrayList<>();
        expectedResult.add(new ResultCoordinates(2, 10));
        expectedResult.add(new ResultCoordinates(3, 15));
        expectedResult.add(new ResultCoordinates(7, 12));
        expectedResult.add(new ResultCoordinates(12, 0));
        expectedResult.add(new ResultCoordinates(15, 10));
        expectedResult.add(new ResultCoordinates(20, 8));
        expectedResult.add(new ResultCoordinates(24, 0));
        assertEquals(expectedResult, skylineProblem.getSilhouetteOfSkylines());
    }

    @Test
    public void testManyBuildings2(){
        int [][] coordinates = {{1, 5, 11}, {2, 7, 6}, {3, 9, 13}, {12, 16, 7}, {14, 25, 3},
                {19, 22, 18}, {23, 13, 29}, {24, 4, 28}};
        SkylineProblem skylineProblem = new SkylineProblem(coordinates);
        List<ResultCoordinates> expectedResult = new ArrayList<>();
        expectedResult.add(new ResultCoordinates(1, 11));
        expectedResult.add(new ResultCoordinates(3, 13));
        expectedResult.add(new ResultCoordinates(9, 0));
        expectedResult.add(new ResultCoordinates(12, 7));
        expectedResult.add(new ResultCoordinates(16, 3));
        expectedResult.add(new ResultCoordinates(19, 18));
        expectedResult.add(new ResultCoordinates(22, 3));
        expectedResult.add(new ResultCoordinates(25, 0));
        assertEquals(expectedResult, skylineProblem.getSilhouetteOfSkylines());
    }


}