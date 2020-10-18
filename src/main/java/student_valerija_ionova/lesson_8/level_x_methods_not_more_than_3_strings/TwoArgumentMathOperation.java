package student_valerija_ionova.lesson_8.level_x_methods_not_more_than_3_strings;

abstract class TwoArgumentMathOperation extends  MathOperation{

    private MathOperation leftSide;
    private MathOperation rightSide;

    TwoArgumentMathOperation (MathOperation leftSide, MathOperation rightSide){
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }


    protected double calculateLeftSide() {return leftSide.calculate();}

    protected  double calculateRightSide () {return rightSide.calculate();}
}
