package student_aleksandra_maksimovic.lesson_3.homeworks.day_5.task_19;

/*
    Создать класс собака (Dog)

    и продемонстрировать его работу с ним в программе.

    Бизнес требования:
    - Должна быть возможность указывать возраст собаки.
    - Возраст указывается в годах (целам числом).
    - Возраст собаке дают в момент создания.
    - Собака должна уметь выполнять команду голос (voice()),
    при выполнении этой команды на консоль должно выводиться
    кличка собаки и ее возраст.

    Создать отдельный класс DogDemo,
    объявить в нём main() метод и продемонстрировать
    использование класса собака (Dog).
*/

public class Dog {

    private String name;
    private int years;


    public Dog(String setName, int setYears) {
        this.name = setName;
        this.years = setYears;

    }

    public void voice() {

        System.out.println("My name is  " + this.name + "! I'am " + this.years + " years old! VUF VUF!!");

    }

}
