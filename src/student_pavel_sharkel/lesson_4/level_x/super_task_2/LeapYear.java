package student_pavel_sharkel.lesson_4.level_x.super_task_2;

public class LeapYear {

    int year;

    public boolean isLeapYear(int year) {
        this.year = year;

        if ((year % 4) != 0) {
            return false;
        } else {
            if ((year % 100) == 0) {
                if ((year % 400) == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
    }
}
