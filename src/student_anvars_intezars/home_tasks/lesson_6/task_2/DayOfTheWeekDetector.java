package student_anvars_intezars.home_tasks.lesson_6.task_2;
/*
Создайте класс DayOfTheWeekDetector.
В классе DayOfTheWeekDetector создайте метод:
String detectDayName(int number).
Этот метод будет по введённому числу определять день недели.
Реализуйте этот метод (можно взять код приведённый выше).
Создайте класс DayOfTheWeekDetectorTest и напишите
автоматические тесты для всех сценариев.
 */

public class DayOfTheWeekDetector {

    String result;

    public String detectDayName(int number) {
        if (number == 1) {
            result = "Monday";
        }
        else if (number == 2) {
            result = "Tuesday";
        }
        else if (number == 3) {
            result = "Wednesday";
        }
        else if (number == 4) {
            result = "Thursday";
        }
        else if (number == 5) {
            result = "Friday";
        }
        else if (number == 6) {
            result = "Saturday";
        }
        else if (number == 7) {
            result = "Sunday";
        }
        else {
            System.out.println("Number, which is used is out of range from 1 till 7");
        }
        return result;
    }
}
