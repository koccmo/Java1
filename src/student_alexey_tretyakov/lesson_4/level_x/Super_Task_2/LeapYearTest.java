package student_alexey_tretyakov.lesson_4.level_x.Super_Task_2;


public class LeapYearTest {
    public static void main(String[] args) {
        LeapYear testLeapYear = new LeapYear();

        LeapYearTest.testResult( testLeapYear.isLeapYear( 2020 ),"Высокосный год." );
        LeapYearTest.testResult( !testLeapYear.isLeapYear( 2019 ),"Не высокосный год." );
        LeapYearTest.testResult( testLeapYear.isLeapYear( 2000 ),"Высокосный год ( столетний ) ." );
    }
    private static void testResult(boolean status, String testingString) {
        if (status) {
            System.out.println( testingString + " Test OK.");
        } else {
            System.out.println( testingString + " Test FAIL!!!");
        }
    }

}
