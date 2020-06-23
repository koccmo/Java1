package teacher.lesson_3.homeworks.day_4;

public class Car {
    private String model;

    public Car(String newModel) {
        this.model = newModel;
    }

    // Error:(12, 27) java: ';' expected ...+ ()
    // Error:(13, 26) java: ';' expected ...+ ;
    public String getModel() {
        return this.model;
    }
}
