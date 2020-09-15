/*
Как досрочно закончить текущую итерацию цикла?
Найдите ответ в интернете и напишите пример кода
для циклов while и for.
 */
package student_igors_bartkevics.lesson_6.homework.level_4;

public class Task_17 {
    public static void main(String[] args) {

        //Exit from current iteration of for loop example
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        //Exit from current iteration of while loop example
        int i = 0;
        while (i < 100) {
            if (!(i %2 == 0)) {
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
