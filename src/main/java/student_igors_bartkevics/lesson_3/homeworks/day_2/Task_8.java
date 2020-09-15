/*
Учимся работать со строками.

Тема: Конкатенация строк.

Напишите программу в которой создайте переменную
типа String и присвойте ей в качестве начального значения
ваше имя. Выведете на консоль приветствие типа "Hi YourName".

Подсказка: любые две строки можно соединять знаком "+".

    String userName = "Viktor";
    String greeting = "Hi " + userName + "!";
 */


package student_igors_bartkevics.lesson_3.homeworks.day_2;

public class Task_8 {

    public static void main(String[] args){

        String userName = "Igors";
        String greeting = "Hi " + userName + "!";
        System.out.println(greeting);
    }

}
