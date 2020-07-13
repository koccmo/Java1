package student_sandra_arniece.lesson_4.numbers;
//Task 1
import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userNumber = sc.nextInt();
        if(userNumber > 0){
            System.out.println("The number is  positive.");
        }
        else {
            System.out.println("The number is negative.");
        }

    }

}
