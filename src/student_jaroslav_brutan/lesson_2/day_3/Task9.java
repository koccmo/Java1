package student_jaroslav_brutan.lesson_2.day_3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 8");
        int enterNumber8 = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {     // i=i+1 == i++
            int result = enterNumber8 * i;

            System.out.println(enterNumber8 + "x" + i + "=" + result);
        }
    }

}
