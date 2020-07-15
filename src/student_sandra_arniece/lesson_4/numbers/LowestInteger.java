package student_sandra_arniece.lesson_4.numbers;
//Task 6
import java.util.Scanner;

public class LowestInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int firstInteger = sc.nextInt();
        System.out.println("Enter second integer: ");
        int secondInteger = sc.nextInt();
        if(firstInteger < secondInteger) {
            System.out.println(firstInteger);
        }
        else if(secondInteger <firstInteger) {
            System.out.println(secondInteger);
        }
        else {
            System.out.println("Entered integers are equal.");
        }
    }
}


