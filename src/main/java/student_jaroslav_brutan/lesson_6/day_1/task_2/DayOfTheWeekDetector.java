package student_jaroslav_brutan.lesson_6.day_1.task_2;

public class DayOfTheWeekDetector {

    String detectTheDayName(int number){
        switch (number){
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: return "Number is not valid!";
        }
    }

}
