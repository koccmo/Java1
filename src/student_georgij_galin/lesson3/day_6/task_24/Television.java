package student_georgij_galin.lesson3.day_6.task_24;

public class Television {

    private final String mark;
    private final double price;

    public Television(String mark, double price) {
        this.mark = mark;
        this.price = price;
    }

    public void presentation() {
        System.out.print("Television mark" + this.mark + ". Television price " + this.price + " EUR. ");


    }
}
