package student_valerija_ionova.lesson_12.level_3_junior.task_19;

/*Создайте класс WrongUserInputHandlingDemo
и в main() методе этого класса напишите код, который
- запрашивает у пользователя целое число
- если пользователь введёт не число а строку программа должна сообщить
  пользователю о допущенной ошибке и запросить ввести целое число еще раз.
 */

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class WrongUserInputHandlingDemo {

    public static void main (String [] args){

    while (true){
        try {
            System.out.println("Please input number:");
            Scanner in = new Scanner(System.in);
            int input = Integer.parseInt(in.nextLine());
            break;
        }catch (NumberFormatException exception){
            System.out.println("Sorry, it's not number :o");
        }
    }


    }

}
