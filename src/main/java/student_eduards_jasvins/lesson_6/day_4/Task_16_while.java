package student_eduards_jasvins.lesson_6.day_4;

public class Task_16_while {
    public static void main(String[] args) {
        int number = 0;
        while (number != 200) {
            System.out.println(number);
            number++;
            if (number == 100) {
                break;
            }
        }
    }
}
