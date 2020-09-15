package student_roberts_kupcs.lesson_4.homework.level_1;

import java.util.Scanner;


public class EvenUnevenNumberDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = 0;
        System.out.print("Ввод: ");
        number = sc.nextInt();

        EvenUnevenNunber evenUnevenNunber = new EvenUnevenNunber();
        if ((number % 2) == 0) {
            System.out.println("Число: " + number + " четное");
        } else {
            System.out.println("Число " + number + " нечетное");
        }

    }

}
