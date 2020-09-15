package student_jaroslav_brutan.lesson_3.day_5.task_21;

public class Dog {
    private String name;
    private int age;
    private String color;

    public void voice(){
        System.out.println("My name is " + name + ", I'm " + age + " years old and I'm " + color + " color.");
    }
    public String getName(String name){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
}
