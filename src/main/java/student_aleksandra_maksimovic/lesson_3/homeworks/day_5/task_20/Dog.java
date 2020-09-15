package student_aleksandra_maksimovic.lesson_3.homeworks.day_5.task_20;

        /*Тема: создание класса Dog. Продолжение.

        Создать класс собака (Dog)
        и продемонстрировать его работу с ним в программе.

        Бизнес требования:
        - Должна быть возможность увеличивать возраст собаки на один.

        PS: научите собаку праздновать свой день рождения,
        создайте в классе Dog метод:

        public void happyBirthday() {
        // напишите тут команду увеличения возраста на 1
        }

        Создать отдельный класс DogDemo,
        объявить в нём main() метод и продемонстрировать
        использование класса собака (Dog).

        Создайте собаку,
        заставьте её подать голос,
        заставте её отпраздновать день рождение,
        заставьте её подать голос снова и убедитесь в том,
        что её возраст увеличился на 1.
        */
public class Dog {

    private String name;
    private int years;

    public Dog (String setName, int setYears) {

        this.name = setName;
        this.years = setYears;


    }

    public void voice() {

        System.out.println("My name is  " + this.name + "!");
        System.out.println("I'am " + this.years + " years old!");

    }

    public void happyBirthday() {

        this.years ++;

        System.out.println("Happy Birthday Bob, now you  " + this.years + " years old");

    }

}