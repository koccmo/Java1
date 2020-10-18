package student_anvars_intezars.home_tasks.lesson_12.level_3.task_19;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class WrongUserInputHandlingDemo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter any number from range from 1 till 5");
        System.out.println();

        int number = in.nextInt();

        if (number >= 1 && number <= 5) {
            System.out.println("The number is correct");
        } else {
            System.out.println("The number is incorrect. Please try again");
            number = in.nextInt();
        }
    }
}
