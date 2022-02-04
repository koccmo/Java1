package roman.lesson_6.homework.day_1.task_2;

public class DayOfTheWeekDetector {
    public static void main(String[] args) {
        DayOfTheWeekDetector day = new DayOfTheWeekDetector();

        String weekDay = day.detectDayName(5);
        day.printDay(weekDay);
    }

    public String detectDayName (int number) {
        String result = switch (number) {
            case 1 -> result = "Monday";
            case 2 -> result = "Tuesday";
            case 3 -> result = "Wednesday";
            case 4 -> result = "Thursday";
            case 5 -> result = "Friday";
            case 6 -> result = "Saturday";
            case 7 -> result = "Sunday";
            default -> result = "You entered not correct number or symbol";
        };
        return result;
    }

    public void printDay (String day) {
        System.out.println(day);
    }
}
