package student_volodya_danilin.lesson_10.level_2.Task_5;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
interface DayOfTheWeekDetector {

	@CodeReviewComment(teacher = "Remove unused field!")
    String detectorName = "Default";

    String getDetectorName();

    String detectDayName(int number);

}
