package student_igors_bartkevics.lesson_8.homework.level_x.super_task_2;

class Multiplication extends TwoArgumentMathOperation {


    public Multiplication(MathOperation leftArgument, MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate() {
        return calculateLeftSide() * calculateRightSide();
    }
}
