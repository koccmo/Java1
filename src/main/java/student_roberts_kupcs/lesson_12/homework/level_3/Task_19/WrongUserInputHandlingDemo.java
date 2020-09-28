package student_roberts_kupcs.lesson_12.homework.level_3.Task_19;

import java.util.Scanner;

class WrongUserInputHandlingDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number = null;
        int grade = -1;

        while (grade < 0 || grade > 5) {
            try {
                System.out.print("Enter grade (0-5): ");
                number = input.nextLine();
                grade = Integer.parseInt(number);
                if (grade < 0 || grade > 5) {
                    System.out.println(number + " is not a valid grade.");
                }
            } catch (NumberFormatException nfe) {
                System.out.println(number + " is not a valid grade.");
            }
        }
    }
}
