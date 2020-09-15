package student_vladislav_zagrebin.lesson_3.homeWork.day_5.task_21;

public class Dog {

    private String dogName;
    private int dogAge;
    private String dogColour;

    public void dogVoice() {

        System.out.println("My name is " + dogName + ", I am " + dogAge
                + " years old and my fur has " + dogColour + " colour" );
    }

    public String getDogName(String dogName){
        return dogName;
    }

    public void setDogName(String dogName) { this.dogName = dogName; }
    public int getDogAge() { return dogAge; }
    public void setDogAge(int dogAge) { this.dogAge = dogAge;}
    public String getDogColour() { return dogColour; }
    public void setDogColour(String dogColour) { this.dogColour = dogColour; }
}
