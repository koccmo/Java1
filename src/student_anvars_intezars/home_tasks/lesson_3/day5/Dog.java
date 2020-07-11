package student_anvars_intezars.home_tasks.lesson_3.day5;

public class Dog {

    private String name;
    private int age;
    private int birthday;  // не используемое свойство!
    private String color;

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
        System.out.println("My age is " +getAge());
        System.out.println("My color is " + getColor());
    }
    public void happyBirthday() {
        System.out.println("Happy Birthday!!!");
        System.out.println("Sunny you are now " + (age + 1));
    }

        public String getColor () {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void changeColor(String newColor) {
            System.out.println("Now my color is " + newColor);
        }


}
