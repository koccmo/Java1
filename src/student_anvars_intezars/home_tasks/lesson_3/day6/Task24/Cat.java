package student_anvars_intezars.home_tasks.lesson_3.day6.Task24;

public class Cat {

    private String name;
    private int age;
    private String color;

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

    public String getColor () {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void makesMur() {
        System.out.println ("Mur, mur");
    }

    public void asksForFood() {
        System.out.println("Master, please feed me!");
    }
}
