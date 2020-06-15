package student_georgij_galin.lesson2.day_3;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner input = new Scanner(System.in);
        int userNumber = input.nextInt();

        for (int i = 1; i <= 10; i++){

            System.out.println( userNumber + " x " + i +" = " + i * userNumber );
        }


    }


}