package student_volodya_danilin.lesson_8.level_4.Task_15;

public abstract class Shape {

    private String title;

    public Shape(String title) {
        this.title = title;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public String getTitle() {
        return this.title;
    }
}
