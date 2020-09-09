package student_anvars_intezars.home_tasks.lesson_10.level_2.task_4_5;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
class DayOfTheWeekDetectorIfVersion implements DayOfTheWeekDetector{

	@CodeReviewComment(teacher = "Put @Override annotation on methods from interfaces.")

    @Override
     public String detectDayName(int number) {
        if (number == 1) {
            return "Monday";
        } else if (number == 2) {
            return "Tuesday";
        } else if (number == 3) {
            return "Wednesday";
        } else if (number == 4) {
            return "Thursday";
        } else if (number == 5) {
            return "Friday";
        } else if (number == 6) {
            return "Saturday";
        } else if (number == 7) {
            return "Sunday";
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }
}
