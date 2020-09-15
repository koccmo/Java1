/*
Как выйти из бесконечного цикла?
Найдите в интернете и напишите пример кода
для циклов while и for.
 */
package student_jekaterina_loseva.lesson_6.level_4;

public class Task_16 {

    public static void main(String[] args) {
        int i;
        while (true) {
            for (i = 0; i < 10; i++) {
                System.out.println(i);
            }
            break;
        }
    }
}


