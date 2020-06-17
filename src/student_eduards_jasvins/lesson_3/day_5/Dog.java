package student_eduards_jasvins.lesson_3.day_5;

public class Dog {

    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void happyBirthday() {
        this.age++;
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }

    public void voice() {
        System.out.println("Dog name is = " + this.name + "\nDog is = " + this.age + " year old" + "\nDog color is = " + this.color);
    }

}




