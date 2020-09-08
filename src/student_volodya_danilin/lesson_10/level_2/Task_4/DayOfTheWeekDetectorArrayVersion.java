package student_volodya_danilin.lesson_10.level_2.Task_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector{

    @Override
    public String detectDayName(int number) {
        String[] weekDays = {"Please input a valid number between 1 and 7",
        "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
        "Saturday", "Sunday"};
        if (number < 1 || number > 7) {
            return weekDays[0];
        }
        else {
            return weekDays[number];
        }
    }
}
