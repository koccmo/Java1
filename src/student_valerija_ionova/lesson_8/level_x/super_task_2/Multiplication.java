package student_valerija_ionova.lesson_8.level_x.super_task_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Multiplication extends TwoArgumentMathOperation{

    public Multiplication (MathOperation leftSide, MathOperation rightSide){
        super (leftSide, rightSide);
    }

    @Override
    public double calculate (){
        return calculateLeftSide() * calculateRightSide();
    }

}
