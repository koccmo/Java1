package student_anvars_intezars.home_tasks.lesson_3.day5;

public class Dog {

    private String name;
    private int age;
    private int birthday;

    public String getName(String name) {
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

    public void voice() {
        System.out.println("Sunny");
    }
    public void happyBirthday() {
        System.out.println("Happy Birthday!!!");
        System.out.println("Sunny you are now " + (age+1 ));
       ;

    }
}
