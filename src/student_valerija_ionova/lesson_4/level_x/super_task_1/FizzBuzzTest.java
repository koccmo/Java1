package student_valerija_ionova.lesson_4.level_x.super_task_1;

/*Создайте класс FizzBuzzTest и напишите автоматические тесты,
которые покрывают все возможные сценарии.*/

import student_valerija_ionova.lesson_4.level_x.super_task_1.FizzBuzz;

public class FizzBuzzTest {
    public static void main(String[] args){

        FizzBuzz fizzBuzz = new FizzBuzz();

        if (fizzBuzz.detect(15).equals("FizzBuzz"))
            System.out.println("Class FizzBuzz is working good if number /3 & /5 ");

        if (fizzBuzz.detect(3).equals("Fizz"))
            System.out.println("Class FizzBuzz is working good if number /3");

        if (fizzBuzz.detect(5).equals("Buzz"))
            System.out.println("Class FizzBuzz is working good if number /5");

        if (fizzBuzz.detect(4).equals("4"))
            System.out.println("Class FizzBuzz is working good if number !/3 & !/5");
    }
}
