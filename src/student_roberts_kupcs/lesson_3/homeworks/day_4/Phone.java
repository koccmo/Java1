package student_roberts_kupcs.lesson_3.homeworks.day_4;

public class Phone {
    private String model;

    // Error:(6, 12) java: invalid method declaration; return type required (public Book)
    public Phone(String newModel) {
        this.model = newModel;
    }

    public String getModel() {
        return this.model;
    }
}
