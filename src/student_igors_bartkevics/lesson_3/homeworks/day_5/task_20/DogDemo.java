/*
Тема: создание класса Dog. Продолжение.

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

package student_igors_bartkevics.lesson_3.homeworks.day_5.task_20;

class DogDemo{

    public static void main(String[] args){

        Dog dog = new Dog("Bella", 7);

        System.out.println("Bella - voice: " + dog.voice());
        dog.happyBirthday();
        System.out.println("Bella - voice: " + dog.voice());
        dog.happyBirthday();
        System.out.println("Bella - voice: " + dog.voice());

    }
}