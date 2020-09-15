package student_aleksandra_maksimovic.lessons_10.level_2.task_4_5;

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

