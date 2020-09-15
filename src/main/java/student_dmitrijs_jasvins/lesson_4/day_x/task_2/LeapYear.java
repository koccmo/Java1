package student_dmitrijs_jasvins.lesson_4.day_x.task_2;

class LeapYear {

    public boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else {
            return year % 400 == 0;
        }
    }
}
