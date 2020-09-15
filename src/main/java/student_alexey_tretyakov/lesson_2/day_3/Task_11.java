package student_alexey_tretyakov.lesson_2.day_3;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {

        // Enter first number;
        Scanner scannerNumber = new Scanner(System.in);
        String[] w =  {"first" ,"second" , "third"};
        float[] scanNumber = new float[3];
        //boolean truePoint= false;
        System.out.println("Please input 3 number. ");
        System.out.println();
        float sum = 0;

        for (int i=0; i< scanNumber.length; i++) {

           System.out.print("Input " + w[i] + " number : ");
           scanNumber[i] =scannerNumber.nextFloat();

           //float testNumber = scanNumber[i];
           /*truePoint = false;
           while ( truePoint == true ) {
               if (scanNumber[i] instanceof float) truePoint = true;
               else truePoint = false;
               if (truePoint == false) {
                   System.out.println("You input wrong" + w[i] + " number !!!" + scanNumber[i]);
                   System.out.print("Try again input " + w[i] + " number : ");
                   scanNumber[i] = scannerNumber.nextFloat();
               }
           }
           */
         sum += scanNumber[i];
        }
        System.out.println();
        System.out.println("Average result is = " + sum / scanNumber.length);
    }


}

