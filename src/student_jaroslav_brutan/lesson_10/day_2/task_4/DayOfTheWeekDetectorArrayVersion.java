package student_jaroslav_brutan.lesson_10.day_2.task_4;

public class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector{

    public String detectDayName(int number) {
        String[] dayOfTheWeek = new String[7];
        dayOfTheWeek[0] = "Monday";
        dayOfTheWeek[1] = "Tuesday";
        dayOfTheWeek[2] = "Wednesday";
        dayOfTheWeek[3] = "Thursday";
        dayOfTheWeek[4] = "Friday";
        dayOfTheWeek[5] = "Saturday";
        dayOfTheWeek[6] = "Sunday";
        if (number < 1 || number > 7) {
           return "Enter number from 1 to 7!";
        } else {
            return dayOfTheWeek[number - 1];
        }
    }
}
