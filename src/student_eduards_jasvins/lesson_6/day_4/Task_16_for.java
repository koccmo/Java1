package student_eduards_jasvins.lesson_6.day_4;

public class Task_16_for {
    public static void main(String[] args) {
        int number = 0;
        for (int i = 0; i < 40; i++) {
            System.out.println("i = " + i);
            number++;
            if (number == 24) {
                break;
            }
        }
    }
}
