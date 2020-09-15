package student_jekaterina_loseva.lesson_3.day_5.task_18;

public class Dog {

    private String name;

    public Dog(String dogName) {
        this.name = dogName;
    }

    public void getVoice() {
        System.out.println("Dog says to command voice: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(name);
        }
    }

}
