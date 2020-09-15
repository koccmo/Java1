package student_jaroslav_brutan.lesson_6.day_4;

public class Task_16_ForBreak {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++){
            System.out.println(i);
            if (i == 99){
                System.out.println("Infinity loop exit");
                break;
            }
        }
    }
}
