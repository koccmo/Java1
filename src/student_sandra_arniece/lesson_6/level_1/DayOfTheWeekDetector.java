package student_sandra_arniece.lesson_6.level_1; //Task_2

class DayOfTheWeekDetector {

    public String detectDayName(int number) {
        if ((number >= 1) && (number <= 7)) {
            switch (number) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
            }
        }
        return "Please input a valid number between 1 and 7";
    }

}
