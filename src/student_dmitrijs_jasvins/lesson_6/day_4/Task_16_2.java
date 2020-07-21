package student_dmitrijs_jasvins.lesson_6.day_4;

public class Task_16_2 {
    public static void main(String[] args) {
        int number = 0;
        for (int i = 0; i < 50 ; i++) {
            System.out.println("i = " + i);
            number++;
            if(number == 30){
                break;
            }
        }
    }
}
