package student_valerija_ionova.lesson_10.level_2.task_4_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeekDetectorArrayVersion implements  DayOfTheWeekDetector{

    @Override
    public String detectDayName(int number) {
        String [] dayOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        return dayOfTheWeek[number-1];
    }

}
