package student_dmitrijs_jasvins.lesson_4.day_x.task_2;

public class LeapYearTest {

    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.test1();   // название тестового метода может отображать,
        leapYearTest.test2();   // что за сченарий тестируется
        leapYearTest.test3();   // это будет лучше чем test1(), test2(), test3()

    }

    public void test1() {
        LeapYear leapYear = new LeapYear();
        if (!leapYear.isLeapYear(1700)) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }

    public void test2() {
        LeapYear leapYear = new LeapYear();
        if (leapYear.isLeapYear(2000)) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }

    public void test3() {
        LeapYear leapYear = new LeapYear();
        if (leapYear.isLeapYear(2004)) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }
}
