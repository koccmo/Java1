package student_volodya_danilin.lesson_6.level_1;


import java.util.Random;

public class DayOfTheWeekDetector {

    String detectDayName(int number){

        String dayNameAnswer = "Invalid number!";

            switch (number) {
                case 1 : dayNameAnswer = "Monday";
                break;
                case 2 : dayNameAnswer = "Tuesday";
                break;
                case 3 : dayNameAnswer = "Wednesday";
                break;
                case 4 : dayNameAnswer = "Thursday";
                break;
                case 5 : dayNameAnswer = "Friday";
                break;
                case 6 : dayNameAnswer = "Saturday";
                break;
                case 7 : dayNameAnswer = "Sunday";
            }

            return dayNameAnswer;
    }
}

class DayOfTheWeekDetectorTest {

    public static void main(String[] Args) {

        Random randomNumber = new Random();
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();

        for (int i = 0; i <= 20; i++) {
            int testNumber = randomNumber.nextInt(10);
            System.out.println(testNumber + " is " + dayOfTheWeekDetector.detectDayName(testNumber));
        }
    }
}