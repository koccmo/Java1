package student_aleksandra_maksimovic.lesson_3.homeworks.day_6.task_24;

/*
    Выберите два разных объекта из реального мира.
    Для каждого объекта выделите 2 - 3 самых важных
    свойства и поведения, которое с этими свойствами
    связано. Создайте для каждого объекта из реального
    мира Java класс с его описанием. Создайте так же
    Demo класс для каждого описанного вами объекта
    и продемонстрируйте работу с объектом.
 */

public class Rat {
    private String name;
    private String color;
    private int hunger = 10;

    public Rat(String name, String color) {
        this.name = name;
        this.color = color;

    }



    public void touch() {
        if(isHappy()) {
            say("Hey owner! I'am in good mood,wanna scratch my belly?!!");
        } else {
            say("I'am hungry, your finger looks delicious ! Bite ,the finger!");
        }

    }

    public void feed() {
        this.hunger = this.hunger + 10;
        say("Om nom nom! That's delicious!");
    }

    public void sleep() {
        this.hunger = this.hunger - 10;
        say("I slept well, feel hungry now!");

    }


    private boolean isHappy() {
        return this.hunger > 0;

    }

    private void say(String text) {
        System.out.println(this.name + " - the " + this.color + " rat : " + text);
    }




}
