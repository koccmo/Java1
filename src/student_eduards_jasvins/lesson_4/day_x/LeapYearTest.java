package student_eduards_jasvins.lesson_4.day_x;

public class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.test();
        leapYearTest.test2();
        leapYearTest.test3();
    }
    public void test() {
        LeapYear leapYear = new LeapYear();
        if (leapYear.leapYear(1891)) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FALSE");
        }
    }
    public void test2() {
        LeapYear leapYear = new LeapYear();
        if (leapYear.leapYear(1952)) {
            System.out.println("Test 2 = OK");
        } else {
            System.out.println("Test 2 = FALSE");
        }
    }
    public void test3() {
        LeapYear leapYear = new LeapYear();
        if (leapYear.leapYear(2020)) {
            System.out.println("Test 3 = OK");
        } else {
            System.out.println("Test 3 = FALSE");
        }
    }
}
