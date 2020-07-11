package student_georgij_galin.lesson5.level_2;

import java.util.Scanner;

public class task_11 {
    public static void main(String[] args) {

        int[] numbers = new int[3];


        Scanner myInput = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please input number Nr."+(i+1)+": ");
            numbers[i] = myInput.nextInt();
        }

        for (int number:numbers
        ) {
            System.out.print(number+" ");
        }
    }

}
