package student_eduards_jasvins.lesson_6.day_1;
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
    String detectDayName(int number) {
        switch (number) {
            case 1 : return "Monday";
            case 2 : return "Tuesday";
            case 3 : return "Wednesday";
            case 4 : return "Thursday";
            case 5 : return "Friday";
            case 6 : return "Saturday";
            case 7 : return "Sunday";
            default: return "Please enter number from 1 to 7";

        }
    }

}
