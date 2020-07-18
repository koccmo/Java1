package student_volodya_danilin.lesson_3.day_5;

//Создать класс собака (Dog)
//и продемонстрировать его работу с ним в программе.
//
//Бизнес требования:
//- У собаки должна быть кличка.
//- Кличку собаке дают в момент создания и потом ее изменить нельзя.
//- Собака должна уметь выполнять команду голос (voice()),
//при выполнении этой команды на консоль должно выводиться
//кличка собаки три раза.
//
//Создать отдельный класс DogDemo,
//объявить в нём main() метод и продемонстрировать
//использование класса собака (Dog).

import java.util.Scanner;

public class Dog {

    private String name;
    private int age;
    private String color;

    Scanner sc1 = new Scanner(System.in);


    Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void voice() {
       //for (int i = 1; i <=3; i++){
       //     System.out.println(this.name);
       //}
       System.out.println(this.name + " is " + this.age + " years old.");
       System.out.println(this.name + " is " + this.color);
    }

    public void happyBirthday(){
        this.age = age + 1;
        System.out.println("Happy birthday, dog!");
    }

    public void changeColor(String newColor) {
        System.out.println("You can change color here: ");
        this.color = sc1.nextLine();
    }
}