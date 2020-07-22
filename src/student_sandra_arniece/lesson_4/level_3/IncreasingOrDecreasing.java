package student_sandra_arniece.lesson_4.level_3; //Task 9

import java.util.Scanner;

class IncreasingOrDecreasing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input three integers, after each integer input pressing Enter: ");
        int firstInteger = sc.nextInt();
        int secondInteger = sc.nextInt();
        int thirdInteger = sc.nextInt();

        if ((firstInteger < secondInteger) && (secondInteger < thirdInteger)) {
            System.out.println("increasing");
        } else if ((thirdInteger < secondInteger) && (secondInteger < firstInteger)) {
            System.out.println("decreasing");
        } else {
            System.out.println("neither increasing or decreasing order");
        }
    }

}
