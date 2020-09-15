/*
Тема: создание класса Dog. Продолжение.

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

package student_igors_bartkevics.lesson_3.homeworks.day_5.task_19;

class DogDemo{

    public static void main(String[] args){

        Dog dog = new Dog("Bella", 7);
        String voice = dog.voice();
        System.out.println("Bella - voice: " + voice);

    }
}