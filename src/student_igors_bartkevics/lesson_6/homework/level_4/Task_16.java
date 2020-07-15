/*
Как выйти из бесконечного цикла?
Найдите в интернете и напишите пример кода
для циклов while и for.
 */
package student_igors_bartkevics.lesson_6.homework.level_4;

public class Task_16 {

    public static void main(String[] args) {

        //Exit from endless for loop example
        for (int i = 0; i > -1; i++) {
            System.out.println(i);
            if (i == 100) {
                System.out.println("Exit from endless loop FOR");
                break;
            }
        }

        //Exit from endless while loop example
        int i = 0;
        while (i > -1) {
            System.out.println("Endless loop");
            if (i == 100) {
                System.out.println("Exit from endless loop WHILE");
                break;
            }
            i++;
        }
    }
}
