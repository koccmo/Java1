package student_volodya_danilin.lesson_12.level_3.Task_20;

import java.util.Scanner;

/*
т.к. ArithmeticException - наследник Exception'а то мы можем просто проверять на Exception;
либо сначала проверить на наследника (Arithmetic exception) и далее ловить "всё остальное"
с помощью Exception

Если наши исключения находятся на одном уровне по наследственности то мы можем записать
их в 1 catch-блок используя XOR (exception1 | exception1 a)
 */

class MultiCatchExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter integer : ");
            int inputInt = sc.nextInt();
            int resultNumber = 100 / inputInt;   //для ArithmeticException'а (деление на 0)

        } catch (ArithmeticException a) {

            System.out.println("Arithmetic exception! Not allowed!");

        } catch (Exception a) {

            System.out.println("Error! Not allowed!");

        }

    }
}
