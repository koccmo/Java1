package student_valerija_ionova.lesson_8.level_x.super_task_2;

class Division extends TwoArgumentMathOperation{

    public Division (MathOperation leftSide, MathOperation rightSide){
        super (leftSide, rightSide);
    }

    @Override
    public double calculate(){
        if (calculateRightSide() == 0){
            System.out.println("Division and 0 are not friends!!");
            return 0;
        }else {
            return (calculateLeftSide() / calculateRightSide());
        }
    }

}
