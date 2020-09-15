package student_dmitrijs_jasvins.lesson_3.day_5.task_22;

class Dog {

    private String name;
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