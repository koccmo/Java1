package student_anvars_intezars.home_tasks.lesson_10.level_2.task_4_5;

import java.util.Scanner;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
class DayOfTheWeekDetectorDemo {

	@CodeReviewComment(teacher = "This property not used, why this property exists?")
    public DayOfTheWeekDetector dayOfTheWeekDetector;

    DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number from 1 till 7:");
        int number = sc.nextInt();
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetectorIfVersion();
        String result = dayOfTheWeekDetector.detectDayName(number);
        System.out.println(result);

    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        dayOfTheWeekDetectorDemo.run();

        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo1 = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        dayOfTheWeekDetectorDemo1.run();
    }
}
