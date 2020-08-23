package student_aleksandra_maksimovic.lesson_8.level_1.task_3;
/*
/*Какие значения принимают свойства класса
(ссылки на объекты и примитивные типы данных)
при вызове дефолтного конструктора?

class Person {

    private String fullName;
    private int age;
    private Address address;

}

Напишите программу, которая продемонстрирует
ответ на этот вопрос.*/

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Person {
    private String fullName;
    private int age;
    private Address address;

    public void defaultValues(){
        System.out.println("fullName - "+ fullName+" age - "+age+" address - "+address);
    }
}

