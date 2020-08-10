package student_jaroslav_brutan.lesson_8.day_3.task_13;

public abstract class Boat {

    private String model;
    private String color;

    public Boat(String model, String color) {
        this.model = model;
        this.color = color;
    }
        abstract String boatSpeed();

}
