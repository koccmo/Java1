package student_pavel_sharkel.lesson_10.level_2.task_4_5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DayOfTheWeekDetectorTestTest {

    private DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion;
    private DayOfTheWeekDetectorSwitchVersion dayOfTheWeekDetectorSwitchVersion;

    @Test
    public void ifTest1() {
        dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        String result = dayOfTheWeekDetectorIfVersion.detectDayName(1);
        assertEquals("Monday", result);
    }

    @Test
    public void ifTest2() {
        dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        String result = dayOfTheWeekDetectorIfVersion.detectDayName(2);
        assertEquals("Tuesday", result);
    }

    @Test
    public void ifTest3() {
        dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        String result = dayOfTheWeekDetectorIfVersion.detectDayName(3);
        assertEquals("Wednesday", result);
    }

    @Test
    public void ifTest4() {
        dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        String result = dayOfTheWeekDetectorIfVersion.detectDayName(4);
        assertEquals("Thursday", result);
    }

    @Test
    public void ifTest5() {
        dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        String result = dayOfTheWeekDetectorIfVersion.detectDayName(5);
        assertEquals("Friday", result);
    }

    @Test
    public void ifTest6() {
        dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        String result = dayOfTheWeekDetectorIfVersion.detectDayName(6);
        assertEquals("Saturday", result);
    }

    @Test
    public void ifTest7() {
        dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        String result = dayOfTheWeekDetectorIfVersion.detectDayName(7);
        assertEquals("Sunday", result);
    }

    @Test
    public void ifTest8() {
        dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        String result = dayOfTheWeekDetectorIfVersion.detectDayName(8);
        assertEquals("Please input a valid number between 1 and 7", result);
    }

    @Test
    public void switchTest1() {
        dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String result = dayOfTheWeekDetectorSwitchVersion.detectDayName(1);
        assertEquals("Monday", result);
    }

    @Test
    public void switchTest2() {
        dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String result = dayOfTheWeekDetectorSwitchVersion.detectDayName(2);
        assertEquals("Tuesday", result);
    }

    @Test
    public void switchTest3() {
        dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String result = dayOfTheWeekDetectorSwitchVersion.detectDayName(3);
        assertEquals("Wednesday", result);
    }

    @Test
    public void switchTest4() {
        dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String result = dayOfTheWeekDetectorSwitchVersion.detectDayName(4);
        assertEquals("Thursday", result);
    }

    @Test
    public void switchTest5() {
        dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String result = dayOfTheWeekDetectorSwitchVersion.detectDayName(5);
        assertEquals("Friday", result);
    }

    @Test
    public void switchTest6() {
        dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String result = dayOfTheWeekDetectorSwitchVersion.detectDayName(6);
        assertEquals("Saturday", result);
    }

    @Test
    public void switchTest7() {
        dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String result = dayOfTheWeekDetectorSwitchVersion.detectDayName(7);
        assertEquals("Sunday", result);
    }

    @Test
    public void switchTest8() {
        dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String result = dayOfTheWeekDetectorSwitchVersion.detectDayName(8);
        assertEquals("Please input a valid number between 1 and 7", result);
    }
}