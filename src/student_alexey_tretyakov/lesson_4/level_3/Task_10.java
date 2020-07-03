package student_alexey_tretyakov.lesson_4.level_3;

import java.util.Scanner;


   class MaxOfThree {
       public int int1 ;
       public int int2 ;
       public int int3 ;

       public MaxOfThree (int intX, int intY, int intZ) {
           this.int1 = intX;
           this.int2 = intY;
           this.int3 = intZ;
       }
       public void setMaxOfThree (int intX, int intY, int intZ) {
           this.int1 = intX;
           this.int2 = intY;
           this.int3 = intZ;
       }

       public int getmax3() {
           if (int1 > int2) {
               if (int1 > int3) {
                   return int1;
               } else {
                   if (int1 == int3) {
                       return 0; // int1=int3
                   } else {
                       return int3;
                   }
               }
           } else {
               if (int1 < int2) {
                   if (int2 > int3) {
                       return int2;
                   } else {
                       if (int2 == int3) {
                           return 0; // int2=int3
                       } else {
                           return int3;
                       }
                   }
               } else {
                   if (int1 > int3) {
                       return 0; // int1=int2 max
                   } else {
                       if (int1 == int3) {
                           return 0; // int1=int2=int3
                       } else {
                           return int3;
                       }
                   }
               }
           }
       }
   }

public class Task_10 {


   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       System.out.print("Введите первое целое число = ");
       int int1 = scanner.nextInt();
       System.out.print("Введите второе целое число = ");
       int int2 = scanner.nextInt();
       System.out.print("Введите третье целое число = ");
       int int3 = scanner.nextInt();
       MaxOfThree maxNumber = new MaxOfThree(int1, int2, int3);
       if ( maxNumber.getmax3()==0) {
           System.out.println( "Тут 2 и болле равных числа");
       } else {
           System.out.println(" Максимальное число = " + maxNumber.getmax3());
       }

        /* Далее часть для тестирования
       int int1 = 1;
       int int2 = 3;
       int int3 = 5;
       MaxOfThree maxNumber = new MaxOfThree(int1, int2, int3);
       System.out.println(int1 + "  " + int2 + "  " + int3);
       System.out.println(maxNumber.getmax3() + " 0 is NOT only one numbers max");

       int1 = 7;
       int2 = 3;
       int3 = 1;
       maxNumber.setMaxOfThree( int1, int2, int3);
       System.out.println(int1 + "  " + int2 + "  " + int3);
       System.out.println(maxNumber.getmax3() + " 0 is NOT only one numbers max");

       int1 = 1;
       int2 = 5;
       int3 = 3;
       maxNumber.setMaxOfThree( int1, int2, int3);
       System.out.println(int1 + "  " + int2 + "  " + int3);
       System.out.println(maxNumber.getmax3() + " ---- 0 is NOT only one numbers max");

       int1 = 1;
       int2 = 1;
       int3 = 3;
       maxNumber.setMaxOfThree( int1, int2, int3);
       System.out.println(int1 + "  " + int2 + "  " + int3);
       System.out.println(maxNumber.getmax3() + " 0 is NOT only one numbers max");

       int1 = 1;
       int2 = 3;
       int3 = 3;
       maxNumber.setMaxOfThree( int1, int2, int3);
       System.out.println(int1 + "  " + int2 + "  " + int3);
       System.out.println(maxNumber.getmax3() + " 0 is NOT only one numbers max");

       int1 = 1;
       int2 = 3;
       int3 = 1;
       maxNumber.setMaxOfThree( int1, int2, int3);
       System.out.println(int1 + "  " + int2 + "  " + int3);
       System.out.println(maxNumber.getmax3() + " 0 is NOT only one numbers max");

       int1 = 3;
       int2 = 1;
       int3 = 1;
       maxNumber.setMaxOfThree( int1, int2, int3);
       System.out.println(int1 + "  " + int2 + "  " + int3);
       System.out.println(maxNumber.getmax3() + " 0 is NOT only one numbers max");

       int1 = 3;
       int2 = 1;
       int3 = 3;
       maxNumber.setMaxOfThree( int1, int2, int3);
       System.out.println(int1 + "  " + int2 + "  " + int3);
       System.out.println(maxNumber.getmax3() + " 0 is NOT only one numbers max");

       int1 = 3;
       int2 = 3;
       int3 = 3;
       maxNumber.setMaxOfThree( int1, int2, int3);
       System.out.println(int1 + "  " + int2 + "  " + int3);
       System.out.println(maxNumber.getmax3() + " 0 is NOT only one numbers max");
       */

   }
}
