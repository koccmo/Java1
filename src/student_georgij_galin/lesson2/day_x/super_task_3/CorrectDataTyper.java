package student_georgij_galin.lesson2.day_x.super_task_3;

public class CorrectDataTyper {
    public static void main(String[] args) {

        int numberOne = 10;
        double numberTwo = 20.0;

        System.out.println("Number 1 = " + numberOne);
        System.out.println("Number 2 = " + numberTwo);

        // тут приведение типа не нужно, так как numberTwo уже double
        double sum = numberOne +  numberTwo;

        System.out.println("Sum = " + sum);
    }
}