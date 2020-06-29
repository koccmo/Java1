package student_aleksandra_maksimovic.lesson_3.homeworks.day_5.task_22;
/*
Тема: создание класса Dog. Продолжение.

Создать класс собака (Dog)
и продемонстрировать его работу с ним в программе.

Бизнес требования:
- Должна быть возможность менять цвет собаки на другой.

PS: создайте в классе Dog метод:

    public void changeColor(String newColor) {
        // напишите тут команду сохранения нового цвета в свойство класса
    }

Создать отдельный класс DogDemo,
объявить в нём main() метод и продемонстрировать
использование класса собака (Dog).

Создайте собаку,
заставьте её подать голос,
заставте её поменять цвет,
заставьте её подать голос снова и убедитесь в том,
что собака изменила свой цвет
 */
public class Dog {

    private String color;
    private String name;
    private int years;

    public Dog(String setName, int setYears, String setColor) {

        this.name = setName;
        this.years = setYears;
        this.color = setColor;

    }

    public void voice() {

        System.out.println("My name is  " + this.name + "!");
        System.out.println("I'am " + this.years + " years old!");
        System.out.println("My fur color is " + this.color + " !VUF VUF!!");

    }

    public void happyBirthday() {

        this.years ++;
        System.out.println("Happy Birthday Bob, now you  " + this.years + " years old");

    }

    public void changeColor(String newColor) {
       this.color = newColor;
        System.out.println("I got а new fur color,it's " + this.color + "! So cool!");
    }
}
