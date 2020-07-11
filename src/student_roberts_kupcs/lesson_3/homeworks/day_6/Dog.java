package student_roberts_kupcs.lesson_3.homeworks.day_6;

public class Dog {
    String name;
    String breed;
    int age;
    String color;

    public Dog(String name){
        this.name = name;
    }

    void dogAge(int dogAge) {
        age = dogAge;
    }

    public void printDog() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

}
