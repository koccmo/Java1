package student_aleksandra_maksimovic.lesson_12.level_3.task_19;


import java.util.InputMismatchException;
import java.util.Scanner;

import teacher.codereview.CodeReview;

/*
Создайте класс WrongUserInputHandlingDemo
и в main() методе этого класса напишите код, который
- запрашивает у пользователя целое число
- если пользователь введёт не число а строку программа должна сообщить
  пользователю о допущенной ошибке и запросить ввести целое число еще раз.
 */

@CodeReview(approved = true)
public class WrongUserInputHandlingDemo {
    public static void main(String[] args) {

        while(true) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("Please, enter integer!");
                scan.nextInt();
                break;
            }catch (InputMismatchException exception){
                System.out.println("wrong type! Please ,enter INTEGER!!!");
            }

        }

    }

}
