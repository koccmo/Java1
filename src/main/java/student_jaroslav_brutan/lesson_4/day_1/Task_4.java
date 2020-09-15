package student_jaroslav_brutan.lesson_4.day_1;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
         if (number % 2 == 0){
             System.out.println("he number is even!");
         } else {
             System.out.println("The number is odd!");
         }
    }
}
