package student_alexey_tretyakov.lesson_4.level_1;

import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.print("Введите целое число = ");
        int intNumber = scanner.nextInt();
        if ( (intNumber % 2 ) == 0) {
            System.out.println("Число " + intNumber + " чётное." );
        } else {
            System.out.println("Число " + intNumber + " нечётное." );
        }
    }
}
