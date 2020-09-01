package student_dmitrijs_jasvins.lesson_10.day_2;

class DayOfTheWeekArrayVersion implements DayOfTheWeekDetector {
    @Override
    public String detectDayName(int number) {
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        return weekDays[number-1];
    }
}
