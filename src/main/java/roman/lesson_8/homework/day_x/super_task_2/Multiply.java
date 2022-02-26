package roman.lesson_8.homework.day_x.super_task_2;

public class Multiply extends TwoArgumentMathOperation{

    public Multiply (MathOperation leftArgument, MathOperation rightArgument) {
        super (leftArgument, rightArgument);
    }

    @Override
    public double calculate() {return calculateLeftSide() * calculateRightSide();}
}
