package student_roberts_kupcs.lesson_4.homework.level_1;


import java.util.Scanner;

public class PositiveNumberDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNumber = sc.nextInt();


        if (firstNumber >= 0) {
            System.out.println("First number is positive");
        } else {
            System.out.println("First number is not Positive");
        }
    }
}
