package roman.lesson_4.homework.day_x.superTask_2;

public class LeapYearTest {

    public static void main(String[] args) {
        LeapYearTest check = new LeapYearTest();
        check.divideForFour();
        check.divideForHundred();
        check.divideForAll();
        check.notDivideHundred();
    }
    public void divideForFour() {
        int year = 1481;
        LeapYear test = new LeapYear();
        if (!test.isLeapYear(year)) {
            System.out.println("Year not divide for four it OK!");
        } else System.out.println("Year divide for four Fail!!!");
    }
    public void divideForHundred() {
        int year = 1700;
        LeapYear test = new LeapYear();
        if (!test.isLeapYear(year)) {
            System.out.println("Year not divide for Four Hundred it OK!!!!");
        } else System.out.println("Year divide for Four Hundred it Fail!!!");
    }
    public void divideForAll() {
        int year = 1800;
        LeapYear test = new LeapYear();
        if (!test.isLeapYear(year)) {
            System.out.println("Year divide for All it OK!!!!");
        } else System.out.println("Year not divide for All it FAILL!!!!");
    }
    public void notDivideHundred() {
        int year = 1812;
        LeapYear test = new LeapYear();
        if (!test.isLeapYear(year)) {
            System.out.println("Year not divide for Hundred it OK!!!!");
        } else System.out.println("Year divide for Hundred it OK!!!!");
    }
}
