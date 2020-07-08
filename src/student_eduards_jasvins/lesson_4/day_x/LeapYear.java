package student_eduards_jasvins.lesson_4.day_x;

public class LeapYear {

    public boolean leapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } if (year % 100 != 0) {
            return  true;
        } else  {
            return year % 400 == 0;
        }
    }
}
