package student_vladimir_kobenko.lesson6.homeworks.level_1.Task_2;

import java.util.Scanner;

public class InputData {
    public static void main (String [] args){
        Scanner myInput = new Scanner(System.in);
        InputData inputData = new InputData();

        System.out.print("Input integer number between 1 and 7 : ");
        int firstNumber = myInput.nextInt();

        String result = DayOfTheWeekDetector.detectDayName(firstNumber);
        System.out.println(result);
    }
}
