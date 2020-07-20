package student_dmitrijs_jasvins.lesson_6.day_4;
/*
Как выйти из бесконечного цикла?
Найдите в интернете и напишите пример кода
для циклов while и for.
 */

public class Task_16 {
    public static void main(String[] args) {
        int number = 0;
        while (number != 150) {
            System.out.println(number);
            number++;
            if (number == 124) {
                break;
            }
        }
    }
}
