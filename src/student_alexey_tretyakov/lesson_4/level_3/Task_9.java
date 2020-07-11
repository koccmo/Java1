package student_alexey_tretyakov.lesson_4.level_3;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число = ");
        int int1 = scanner.nextInt();
        System.out.print("Введите второе целое число = ");
        int int2 = scanner.nextInt();
        System.out.print("Введите третье целое число = ");
        int int3 = scanner.nextInt();

        if ( ( int1 < int2 ) && ( int2 < int3 ) ) {
            System.out.println("Numbers are increasing.");
        } else {
            if ( ( int1 > int2 ) && ( int2 > int3 ) ) {
                System.out.println("Numbers are decreasing.");
            } else {
                System.out.println("Neither increasing or decreasing order.");
            }
        }
    }
}
