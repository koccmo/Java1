package student_aleksandra_maksimovic.lesson_4.level_x.task_2;

import student_aleksandra_maksimovic.testing.Tester;

class LeapYearTest {

    public static void main(String[] args) {

        var tester = new Tester();


        LeapYear leapYear = new LeapYear();

        tester.check(leapYear.isLeapYear(2020), "2020 is leap");

        tester.checkFalse(leapYear.isLeapYear(2019), "2019 isn't leap");

    }
}