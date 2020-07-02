package student_alexey_tretyakov.lesson_4.level_2;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число = ");
        int intNumber1 = scanner.nextInt();
        System.out.print("Введите второе целое число = ");
        int intNumber2 = scanner.nextInt();

        if ( intNumber1 != intNumber2 ) {
            System.out.println("Numbers are different ." );
        } else {
            System.out.println("Numbers are equals ." );
        }
    }
}
