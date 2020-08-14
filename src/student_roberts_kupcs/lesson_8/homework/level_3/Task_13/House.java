package student_roberts_kupcs.lesson_8.homework.level_3.Task_13;

public class House extends Buildings {

    private int streetNumber;
    private String streetName;

    public House(String color, int floors) {
        super(color, floors);
    }

    @Override
    public void clean() {
        System.out.println("I clean house in " + streetName + " - " + streetNumber);

    }

    @Override
    public void toFurnish() {

    }
}
