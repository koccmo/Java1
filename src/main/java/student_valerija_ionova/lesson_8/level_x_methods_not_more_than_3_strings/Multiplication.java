package student_valerija_ionova.lesson_8.level_x_methods_not_more_than_3_strings;

class Multiplication extends TwoArgumentMathOperation{


    Multiplication(MathOperation leftSide, MathOperation rightSide) {
        super(leftSide, rightSide);
    }

    @Override
    public double calculate() {
        return calculateLeftSide() * calculateRightSide();
    }
}
