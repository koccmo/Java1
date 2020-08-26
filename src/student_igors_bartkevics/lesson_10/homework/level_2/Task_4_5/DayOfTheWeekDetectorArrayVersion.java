package student_igors_bartkevics.lesson_10.homework.level_2.Task_4_5;

class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    @Override
    public String detectDayName(int number) {
        String[] daysOfTheWeek = new String[7];
        daysOfTheWeek[0] = "Monday";
        daysOfTheWeek[1] = "Tuesday";
        daysOfTheWeek[2] = "Wednesday";
        daysOfTheWeek[3] = "Thursday";
        daysOfTheWeek[4] = "Friday";
        daysOfTheWeek[5] = "Saturday";
        daysOfTheWeek[6] = "Sunday";
        if (number < 1 || number > 7) {
            return "Please input a valid number between 1 and 7";
        }
        else {
            return daysOfTheWeek[number - 1];
        }
    }
}
