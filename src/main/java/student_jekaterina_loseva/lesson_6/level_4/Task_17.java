/*
Как досрочно закончить текущую итерацию цикла?
Найдите ответ в интернете и напишите пример кода
для циклов while и for.
 */
package student_jekaterina_loseva.lesson_6.level_4;

public class Task_17 {

    public static void main(String[] args) {
        int i = 0;
        while (true) {
            for (i = 0; i < 10; i++) {
                System.out.println(i);
                if( i == 5 ) {
                    break;
                }
            }
            break;
        }
    }

}
