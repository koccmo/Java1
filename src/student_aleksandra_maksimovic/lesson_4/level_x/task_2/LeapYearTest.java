package student_aleksandra_maksimovic.lesson_4.level_x.task_2;

import student_aleksandra_maksimovic.testing.Tester;

class LeapYearTest {

    public static void main(String[] args) {

        var tester = new Tester();

		// тут явно не все возможные сценарии протестированы!!
		// и каждый тестовый сценарий в свой отдельный метод, а не в кучу

        LeapYear leapYear = new LeapYear();

        tester.check(leapYear.isLeapYear(2020), "2020 is leap");

        tester.checkFalse(leapYear.isLeapYear(2019), "2019 isn't leap");

    }
}