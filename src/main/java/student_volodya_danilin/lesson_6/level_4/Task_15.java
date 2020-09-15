package student_volodya_danilin.lesson_6.level_4;
//Напишите бесконечный цикл при помощи while и for.

import java.util.Random;

public class Task_15 {
    public static void main(String[] Args) {
        Task_15 task_15 = new Task_15();

        task_15.infiniteWhileLoop();
        //task_15.infiniteForLoop();
    }

    public void infiniteWhileLoop() {
        Random randomNumber = new Random();
        int i = 1;
        while (i == 1) {
            System.out.println("Infinite while loop!   " + randomNumber.nextInt(100));
        }
    }

    public void infiniteForLoop() {
        for(int i = 1; i < 10; i--){
            System.out.println("Infinite for loop!   " + i);
        }
    }
}
