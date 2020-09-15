package student_vladislav_zagrebin.lesson_3.homeWork.day_5.task_22;

public class Dog {

    private String dogName;
    private String dogColour;

    public void dogVoice() {
        System.out.println("My name is " + dogName + ", my fur is " + dogColour + " colour");
    }
    public void changeColour(String newColour) {
        this.dogColour = newColour;
    }

    public String getDogName() { return dogName; }
    public void setDogName(String dogName) {this.dogName = dogName; }

    public String getDogColour() { return dogColour; }
    public void setDogColour(String dogColour) {this.dogColour = dogColour; }
}


