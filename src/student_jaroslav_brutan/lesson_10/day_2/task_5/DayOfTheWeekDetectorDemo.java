package student_jaroslav_brutan.lesson_10.day_2.task_5;

import student_jaroslav_brutan.lesson_10.day_2.task_4.DayOfTheWeekDetector;
import student_jaroslav_brutan.lesson_10.day_2.task_4.DayOfTheWeekDetectorIfVersion;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {

    private DayOfTheWeekDetector dayOfTheWeekDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of the day!");
        int number = scanner.nextInt();
        System.out.println(dayOfTheWeekDetector.detectDayName(number));
    }

    public static void main(String[] args) {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersion();

        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorIf = new DayOfTheWeekDetectorDemo(dayOfTheWeekDetector);

        dayOfTheWeekDetectorIf.run();
    }


}


