package student_igors_bartkevics.lesson_4.homeworks.day_x.super_task_2;

public class LeapYearTest {

    public static void main(String[] args) {

        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.commonYearIsNotDivisibleBy_4();
        leapYearTest.leapYearIsDivisibleBy_4_AndNotDivisibleBy_100();
        leapYearTest.leapYearIsDivisibleBy_400();
        leapYearTest.commonYearIsDivisibleBy_4_AndBy_100_AndNotDivisibleBy_400();

    }

    public void commonYearIsNotDivisibleBy_4() {
        int year = 2019;                         // Если год не делится на 4, значит он обычный.
        LeapYear leapYear = new LeapYear();
        if (!leapYear.isLeapYear(year)) {
            System.out.println("Common year is not divisible by 4 test - OK");
        }
        else {
            System.out.println("Common Year is not divisible by 4 test - FAIL");
        }
    }

    public void leapYearIsDivisibleBy_4_AndNotDivisibleBy_100() {
        int year = 2020;                        // Если делится на 4 и не делится на 100, значит это не столетие и можно сделать вывод, что год високосный.
        LeapYear leapYear = new LeapYear();
        if (leapYear.isLeapYear(year)) {
            System.out.println("Leap year is divisible by 4 and not divisible by 100 test - OK");
        }
        else {
            System.out.println("Leap year is divisible by 4 and not divisible by 100 test - FAIL");
        }
    }

    public void leapYearIsDivisibleBy_400() {
        int year = 2000;                         // Если год делится на 400, то год високосный
        LeapYear leapYear = new LeapYear();
        if (leapYear.isLeapYear(year)) {
            System.out.println("Leap year is divisible by 400 test - OK");
        }
        else {
            System.out.println("Leap year is divisible by 400 test - FAIL");
        }
    }

    public void commonYearIsDivisibleBy_4_AndBy_100_AndNotDivisibleBy_400() {
        int year = 1900;                        // Если год делится на 4 и на 100 и не делится на 400, то год обычный
        LeapYear leapYear = new LeapYear();
        if (!leapYear.isLeapYear(year)) {
            System.out.println("Common year is divisible by 4 and 100 and not divisible by 400 test - OK");
        }
        else {
            System.out.println("Common year is divisible by 4 and 100 and not divisible by 400 test - FAIL");
        }
    }
}
