package student_volodya_danilin.lesson_6.level_4;

public class Task_16 {
    public static void main(String[] Args) {
        Task_16 task_16 = new Task_16();
        task_16.stoppingInfiniteForLoop();
        //task_16.stoppingInfiniteWhileLoop();
    }

    public void stoppingInfiniteForLoop() {
        for (int i = 1; i > 0; i++){
            System.out.println("Infinite for loop!   " + i);
            break; //можно остановить цикл через команду break. либо нажать на стоп в окне компилятора
        }
    }

    public void stoppingInfiniteWhileLoop() {
        int i = 0;
        while (i == 0) {
            System.out.println("Infinite while loop!   " + i);
            break;
        }
    }
}
