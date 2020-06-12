package student_valerija_ionova.lesson_3.day_6.Task_24;

/*Выберите два разных объекта из реального мира.
Для каждого объекта выделите 2 - 3 самых важных
свойства и поведения, которое с этими свойствами
связано. Создайте для каждого объекта из реального
мира Java класс с его описанием. Создайте так же
Demo класс для каждого описанного вами объекта
и продемонстрируйте работу с объектом.*/

public class Deti {
    private String name;
    private char gender;
    private int  age;

    public Deti (String name, char gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void sayYourName(){
        System.out.println("Привет! Меня зовут "+this.name+". Мне "+age+".");
    };

    public void countToTen(){
        System.out.println("Считаю до 10ти хорошо: 1 2 3 4 5 6 7 8 9 10");
    };
}
