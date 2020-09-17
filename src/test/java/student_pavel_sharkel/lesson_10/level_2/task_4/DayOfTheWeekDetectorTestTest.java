package student_pavel_sharkel.lesson_10.level_2.task_4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DayOfTheWeekDetectorTestTest {

    private DayOfTheWeekDetectorIfVersion dayOfTheWeekDetectorIfVersion;

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
}