package student_vladislav_zagrebin.lesson_3.homeWork.task_19;

public class Dog {

    private String dogName;
    private int dogAge;
    public void dogVoice() {

        System.out.println("My name is " + dogName + " and I am " + dogAge + " years old");
    }

    public String getDogName() { return dogName; }

    public void setDogName(String dogName) { this.dogName = dogName; }

    public int getDogAge() { return dogAge; }

    public void setDogAge(int dogAge) { this.dogAge = dogAge; }
}
