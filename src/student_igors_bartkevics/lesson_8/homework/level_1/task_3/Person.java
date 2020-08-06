/*
Какие значения принимают свойства класса
(ссылки на объекты и примитивные типы данных)
при вызове дефолтного конструктора?

class Person {

    private String fullName;
    private int age;
    private Address address;

}

Напишите программу, которая продемонстрирует
ответ на этот вопрос.
 */
package student_igors_bartkevics.lesson_8.homework.level_1.task_3;

class Person {
    private String fullName;
    private int age;
    private Address address;

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public void printValuesOfClassPropertiesToConsole() {
        System.out.println("fullName = " + getFullName());
        System.out.println("age = " + getAge());
        System.out.println("address = " + getAddress());

    }
}
