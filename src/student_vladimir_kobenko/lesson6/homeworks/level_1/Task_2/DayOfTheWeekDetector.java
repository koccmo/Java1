package student_vladimir_kobenko.lesson6.homeworks.level_1.Task_2;

public class DayOfTheWeekDetector {
    static String detectDayName(int number){
            switch (number){
                case 1: return "Monday";
                case 2: return "Tuesday";
                case 3: return "Wednesday";
                case 4: return "Thursday";
                case 5: return "Friday";
                case 6: return "Saturday";
                case 7: return "Sunday";
                default: return "Not valid number!";
            }
        }
}
