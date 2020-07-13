package student_sandra_arniece.lesson_4.numbers;
//Task 10
import java.util.Scanner;

public class HighestFromThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input three integers, after each integer input pressing Enter:");
        int firstInteger = sc.nextInt();
        int secondInteger = sc.nextInt();
        int thirdInteger = sc.nextInt();

        if((firstInteger > secondInteger) && (firstInteger > thirdInteger)){
            System.out.println(firstInteger);
        }
        else if((secondInteger > firstInteger) && (secondInteger > thirdInteger)){
            System.out.println(secondInteger);
        }
        else if((thirdInteger > firstInteger) && (thirdInteger > secondInteger)){
            System.out.println(thirdInteger);
        }
        else if((firstInteger == secondInteger) && (secondInteger == thirdInteger)){
            System.out.println("All entered numbers are equal");
        }
    }

}
