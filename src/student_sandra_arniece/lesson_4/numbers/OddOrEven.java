package student_sandra_arniece.lesson_4.numbers;
//Task 4
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInput = sc.nextInt();
        if(userInput % 2 == 0){
            System.out.println("The entered number is even.");
        }
        else {
            System.out.println("The entered number is odd.");
        }

    }
}
