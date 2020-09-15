package student_jaroslav_brutan.lesson_6.day_4;

public class Task_17_ContinueForLoop {

    public static void main(String[] args) {
        for (int i = 0; i < 30; i++){
            if (i % 2 != 0){
                continue;
            } System.out.println(i);
        }
    }
}
