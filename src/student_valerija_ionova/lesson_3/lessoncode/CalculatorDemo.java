package student_valerija_ionova.lesson_3.lessoncode;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        // 1. get first number from user
        Scanner myInput = new Scanner( System.in );
        System.out.println("Введите первое число: ");
        int firstNumber = myInput.nextInt();

        //2.get second number
        System.out.println("Введите второе число: ");
        int secondNumber = myInput.nextInt();

        int result = calculator.sum(firstNumber, secondNumber);
        System.out.println("Sum of "+firstNumber+" and "+secondNumber+" is "+result);

        result = calculator.multiply(firstNumber, secondNumber);
        System.out.println("Multiply for "+firstNumber+" and "+secondNumber +" is "+result);

        result = calculator.substract(firstNumber, secondNumber);
            System.out.println(" Substracti for "+firstNumber+" and "+secondNumber +" is "+result);

         double result1 = calculator.division(firstNumber, secondNumber);
         System.out.println("Division for "+firstNumber+" and "+secondNumber +" is "+result1);

        }
    }

