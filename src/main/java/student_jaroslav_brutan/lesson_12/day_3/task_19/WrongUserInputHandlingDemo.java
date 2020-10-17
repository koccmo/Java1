package student_jaroslav_brutan.lesson_12.day_3.task_19;

import java.util.Scanner;

public class WrongUserInputHandlingDemo {

    public static void main(String[] args) {

        while (true){
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter number");
                int inputNumber = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException exception) {
                System.out.println("That's not a number!");
            }
        }
    }
}
