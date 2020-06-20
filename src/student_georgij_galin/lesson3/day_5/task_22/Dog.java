package student_georgij_galin.lesson3.day_5.task_22;

public class Dog {

    private final String name;
    private String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void voice() {
        System.out.println("My name is : " + name + " and color is : " + color);
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }
}