package roman.lesson_8.homework.day_x.super_task_2;

public class Divide extends TwoArgumentMathOperation{

    public Divide (MathOperation leftArgument, MathOperation rightArgument) {
        super (leftArgument, rightArgument);
    }

    @Override
    public double calculate() {return calculateLeftSide() / calculateRightSide();}
}
