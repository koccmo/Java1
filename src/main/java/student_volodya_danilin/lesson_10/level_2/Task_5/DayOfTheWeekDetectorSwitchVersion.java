package student_volodya_danilin.lesson_10.level_2.Task_5;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class DayOfTheWeekDetectorSwitchVersion implements DayOfTheWeekDetector {

	@CodeReviewComment(teacher = "This field must be private!")
    String detectorName;

    DayOfTheWeekDetectorSwitchVersion(String detectorName) {
        this.detectorName = detectorName;
    }

    @Override
    public String getDetectorName() {
        return this.detectorName;
    }

    @Override
    public String detectDayName(int number) {
        switch (number) {
            case 1 -> {
                return "Monday";
            }
            case 2 -> {
                return "Tuesday";
            }
            case 3 -> {
                return "Wednesday";
            }
            case 4 -> {
                return "Thursday";
            }
            case 5 -> {
                return "Friday";
            }
            case 6 -> {
                return "Saturday";
            }
            case 7 -> {
                return "Sunday";
            }
            default -> {
                return "Please input a valid number between 1 and 7";
            }
        }
    }
}
