/*
Тема: создание класса Dog.

Создать класс собака (Dog)
и продемонстрировать его работу с ним в программе.

Бизнес требования:
- У собаки должна быть кличка.
- Кличку собаке дают в момент создания и потом ее изменить нельзя.
- Собака должна уметь выполнять команду голос (voice()),
при выполнении этой команды на консоль должно выводиться
кличка собаки три раза.

Создать отдельный класс DogDemo,
объявить в нём main() метод и продемонстрировать
использование класса собака (Dog).
 */

package student_igors_bartkevics.lesson_3.homeworks.day_5.task_18;

class DogDemo{

    public static void main(String[] args){

        Dog dog = new Dog("Bella");
        String voice = dog.voice();
        System.out.println("Bella - voice: " + voice);

    }
}