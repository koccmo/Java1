package student_aleksandra_maksimovic.lesson_3.homeworks.day_5.task_18;


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

 */


public class Dog {

    private String name;

    public Dog (String newName ) {

        this.name = newName;

    }



    public void voice() {

        System.out.println(this.name);
        System.out.println(this.name);
        System.out.println(this.name);

    }
}