package student_roberts_kupcs.lesson_8.homework.level_1.Task_3;

//Какие значения принимают свойства класса
//(ссылки на объекты и примитивные типы данных)
//при вызове дефолтного конструктора?
//
//class Person {
//
//    private String fullName;
//    private int age;
//    private Address address;
//
//}
//
//Напишите программу, которая продемонстрирует
//ответ на этот вопрос.

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Person {

    private String fullName;
    private int age;
    private BiAddress biAddress;

    public void person() {
        System.out.println("String : " + fullName + " Pnt : " + age + " BiAdress : " + biAddress);

    }
}
