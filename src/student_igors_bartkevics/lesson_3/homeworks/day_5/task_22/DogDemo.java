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
что собака изменила свой цвет.
 */

package student_igors_bartkevics.lesson_3.homeworks.day_5.task_22;

class DogDemo{

    public static void main(String[] args){

        Dog dog = new Dog("Bella", 7, "White");

        System.out.println("Bella - voice: " + dog.voice());
        dog.happyBirthday();
        dog.changeColor("Black");
        System.out.println("Bella - voice: " + dog.voice());
        dog.happyBirthday();
        System.out.println("Bella - voice: " + dog.voice());

    }
}