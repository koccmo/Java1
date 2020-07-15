package student_eduards_jasvins.lesson_4.day_x;

public class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
		leapYearTest.notDivide4();
		leapYearTest.notDivide100();
		leapYearTest.notDivide400();
	}
    public void notDivide4() {
        LeapYear leapYear = new LeapYear();
        if (leapYear.leapYear(1891)) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FALSE");
        }
    }
    public void notDivide100() {
        LeapYear leapYear = new LeapYear();
        if (leapYear.leapYear(1952)) {
            System.out.println("Test 2 = OK");
        } else {
            System.out.println("Test 2 = FALSE");
        }
    }
    public void notDivide400() {
        LeapYear leapYear = new LeapYear();
        if (leapYear.leapYear(2010)) {
            System.out.println("Test 3 = OK");
        } else {
            System.out.println("Test 3 = FALSE");
        }
    }
}
