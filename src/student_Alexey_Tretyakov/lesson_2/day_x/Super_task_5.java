package student_Alexey_Tretyakov.lesson_2.day_x;

import java.util.Scanner;

public class Super_task_5 {
    public static void main(String[] args) {

        // Enter first number;
        Scanner scanner = new Scanner(System.in);
        String[] numeralWord = {"first" ,"second" , "third"};
        float[] scanNumber = new float[numeralWord.length];
        System.out.println("Please input 3 number. ");
        System.out.println();
        float sum = 0;

        // Первый вариант решения
        /*

        for (int i=0; i< scanNumber.length; i++) {

            System.out.print("Input " + numeralWord[i] + " number : ");
            scanNumber[i] = scanner.nextFloat();
            sum += scanNumber[i];
        }

         */


        // Второй й вариант решения:

        int i=0;
        while ( i < scanNumber.length)  {

                System.out.print("Input " + numeralWord[i] + " number : ");
                scanNumber[i] = scanner.nextFloat();
                sum += scanNumber[i];
                i += 1;

        }

        System.out.println("Average result is = " + sum / scanNumber.length);
    }
}
