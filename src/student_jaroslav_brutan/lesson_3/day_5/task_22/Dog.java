package student_jaroslav_brutan.lesson_3.day_5.task_22;



public class Dog {
    private String name;
    private String color;

    public void voice(){
        System.out.println("My name is " + name + " and I'm " + color + " color");
    }
    public void changeColor(String newColor){
        this.color = newColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
