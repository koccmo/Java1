package student_sandra_arniece.lesson_4.numbers;
//Task 8
import java.util.Scanner;

public class ThreeNumberComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input three integers, after each integer input pressing Enter: ");
        int firstInteger = sc.nextInt();
        int secondInteger = sc.nextInt();
        int thirdInteger = sc.nextInt();

        if ((firstInteger == secondInteger) && (secondInteger == thirdInteger)){
            System.out.println("All numbers are equal");
        }
        else if((firstInteger != secondInteger) && (secondInteger != thirdInteger) && (firstInteger != thirdInteger)){
            System.out.println("All numbers are different");
        }
        else {
            System.out.println("Neither all are equal or different");
        }
    }
}
