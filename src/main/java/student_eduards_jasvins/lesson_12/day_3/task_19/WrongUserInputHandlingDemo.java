package student_eduards_jasvins.lesson_12.day_3.task_19;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class WrongUserInputHandlingDemo {

    public static void main(String[] args) {

        while (true) {
            try {
                System.out.println("Enter number!");
                Scanner scanner = new Scanner(System.in);
                int number = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException exception) {
                System.out.println("You have entered letter, but you need enter NUMBER!");
            }
        }
    }
}
