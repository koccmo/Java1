package student_valerija_ionova.lesson_8.level_1.task_3;

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

public class Person {
    private String fullName;
    private int age;
    private Address address;

    public void printAnswer(){
        System.out.println("fullName is "+ fullName+" age is "+age+" address is "+address);
    }
}
