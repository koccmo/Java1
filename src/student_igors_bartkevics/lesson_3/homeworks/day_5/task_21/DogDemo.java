/*
Тема: создание класса Dog. Продолжение.

Создать класс собака (Dog)
и продемонстрировать его работу с ним в программе.

Бизнес требования:
- Сделайте возможность указывать цвет собаки.
- Пусть цвет задаётся просто строкой: "Red", "Black", etc.
- Собака должна уметь выполнять команду голос (voice()),
при выполнении этой команды на консоль должно выводиться
кличка собаки, ее возраст и цвет.

PS: добавте свойство color в класс Dog,
добавте в конструктор класса новое свойство и сохраните его,
дополните метод voice() выводом цвета на консоль.

Создать отдельный класс DogDemo,
объявить в нём main() метод и продемонстрировать
использование класса собака (Dog).
 */

package student_igors_bartkevics.lesson_3.homeworks.day_5.task_21;

class DogDemo{

    public static void main(String[] args){

        Dog dog = new Dog("Bella", 7, "White");

        System.out.println("Bella - voice: " + dog.voice());
        dog.happyBirthday();
        System.out.println("Bella - voice: " + dog.voice());
        dog.happyBirthday();
        System.out.println("Bella - voice: " + dog.voice());

    }
}