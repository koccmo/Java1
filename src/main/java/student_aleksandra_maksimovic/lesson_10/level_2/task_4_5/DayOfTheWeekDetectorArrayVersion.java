package student_aleksandra_maksimovic.lesson_10.level_2.task_4_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

         if(number < 1 || number > 7) {
             return "Please input a valid number between 1 and 7";
         }
         else {
             return weekDays[number - 1];
         }

    }
}

