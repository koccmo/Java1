package student_jekaterina_loseva.lesson_6.level_1.task_2;

import java.util.Scanner;

public class DayOfTheWeekDetector {

    String detectDayName(int number) {

        Scanner myInput = new Scanner(System.in);

        System.out.print("Input integer number between 1 and 7 : ");
        int firstNumber = myInput.nextInt();
        if ((firstNumber >= 1) && (firstNumber <= 7)) {
            switch (firstNumber) {
                case 1 -> { return "Monday"; }
                case 2 -> { return "Tuesday"; }
                case 3 -> { return "Wednesday"; }
                case 4 -> { return "Thursday"; }
                case 5 -> { return "Friday"; }
                case 6 -> { return "Saturday"; }
                case 7 -> { return "Sunday"; }
                default -> { return "Please input a valid number between 1 and 7"; }
            }
        }
        else {
            return "Please input a valid number between 1 and 7";
        }

    }

}
