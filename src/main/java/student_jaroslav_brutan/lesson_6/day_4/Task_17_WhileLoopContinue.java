package student_jaroslav_brutan.lesson_6.day_4;

public class Task_17_WhileLoopContinue {

    public static void main(String[] args) {
         int i = 0;
         while (i < 30) {
             i++;
             if (i % 2 != 0){
                 continue;
             } System.out.println(i);
         }
    }
}
