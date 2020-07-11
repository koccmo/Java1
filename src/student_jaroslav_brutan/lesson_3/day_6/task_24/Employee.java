package student_jaroslav_brutan.lesson_3.day_6.task_24;

public class Employee {
    private String name;
    private int age;
    private String profession;
    private double salary;

    public void whatIDo(){
        System.out.println("My profession is " + profession + ".");
            }
            public void mySalary(){
        System.out.println("I earn " + salary + "$");
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

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
