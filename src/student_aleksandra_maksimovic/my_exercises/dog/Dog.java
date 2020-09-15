package student_aleksandra_maksimovic.my_exercises.dog;
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

Бизнес требования:
- Должна быть возможность указывать возраст собаки.
- Возраст указывается в годах (целам числом).
- Возраст собаке дают в момент создания.
- Собака должна уметь выполнять команду голос (voice()),
при выполнении этой команды на консоль должно выводиться
кличка собаки и ее возраст.

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


Создать отдельный класс DogDemo,
объявить в нём main() метод и продемонстрировать
использование класса собака (Dog).
 */
public class Dog {

    private String name = "zuchka";
    private int year = 1;
    private String color;

    public Dog ( String color) {
        this.color = color;
    }


    public void happyBirthday () {
        this.year += 1;
    }

    public void voice() {
        System.out.println(name+ " : - " + year+ " year "+ color);
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }

}