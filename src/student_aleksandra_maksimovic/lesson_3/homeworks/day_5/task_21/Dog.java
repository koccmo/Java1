package student_aleksandra_maksimovic.lesson_3.homeworks.day_5.task_21;
    /*Тема: создание класса Dog. Продолжение.

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




    }