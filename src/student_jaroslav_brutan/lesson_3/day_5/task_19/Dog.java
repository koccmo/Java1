package student_jaroslav_brutan.lesson_3.day_5.task_19;

public class Dog {
    private String name;
    private int age;
    public void voice(){
        System.out.println("My name is " + name + " and I'm " + age + " years old.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
