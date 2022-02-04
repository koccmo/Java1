package roman.lesson_4.homework.day_x.superTask_2;

public class LeapYear {
    public boolean isLeapYear(int year) {
        if (!(year % 4 == 0)) {
            return false;
        } else
            if (!(year % 100 == 0)) {
                return true;
            } else
                return year % 400 == 0;
    }
}
