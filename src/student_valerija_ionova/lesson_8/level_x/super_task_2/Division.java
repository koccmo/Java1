package student_valerija_ionova.lesson_8.level_x.super_task_2;

class Division extends TwoArgumentMathOperation{

    public Division (MathOperation leftSide, MathOperation rightSide){
        super (leftSide, rightSide);
    }

    @Override
    public double calculate(){
        return (calculateLeftSide() / calculateRightSide());
    }

}
