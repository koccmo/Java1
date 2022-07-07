package roman.lesson_10.day_2.task_4_5;

public class DayOfWeekDetectorArrayVersion implements DayOfTheWeekDetector{
    @Override
    public String detectDayName(int number) {
        String [] weekDays = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String result = "Please input a valid number between 1 and 7";
        for (int i = 0; i < weekDays.length; i++ ) {
            if (i == (number -1)) {
                result = weekDays[i];
            }
        }
        return result;
    }
}
