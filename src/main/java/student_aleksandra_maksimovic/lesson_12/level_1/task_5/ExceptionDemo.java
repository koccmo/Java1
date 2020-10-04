package student_aleksandra_maksimovic.lesson_12.level_1.task_5;

import java.io.PrintWriter;
import java.io.StringWriter;

/*
Воспользуйтесь документацией Java (javadoc)
и найдите информацию о классе java.lang.Exception.

Напишите класс ExceptionDemo, в котором продемонстрирейте
разные способы создания экземпляра класса Exception.
 */
public class ExceptionDemo {


    public static void main(String[] args) {

        Exception exception1 = new Exception();


        Exception exception2 = new Exception("Error message");
        try {
            throw exception2;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Exception exception3 = new Exception("Super exception", exception2);
            throw exception3;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause().getMessage());
        }

        try {
            Exception exception4 = new Exception(exception2);
            throw exception4;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause().getMessage());
        }
    }
}
