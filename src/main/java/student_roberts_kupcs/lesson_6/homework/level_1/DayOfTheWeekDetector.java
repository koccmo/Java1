package student_roberts_kupcs.lesson_6.homework.level_1;


class DayOfTheWeekDetector {
    String detectDayName(int number) {
        String result = "";

        if ((number >=1) && (number <= 7)) {

        switch (number) {
                case 1 -> result = "Monday";
                case 2 -> result = "Tuesday";
                case 3 -> result = "Wednesday";
                case 4 -> result = "Thursday";
                case 5 -> result = "Friday";
                case 6 -> result = "Saturday";
                case 7 -> result = "Sunday";
            }
        } else {
        result = "Please input a valid number between 1 and 7";
        }
        return result;
    }
}
