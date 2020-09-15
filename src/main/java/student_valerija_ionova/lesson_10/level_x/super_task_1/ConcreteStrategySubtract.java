package student_valerija_ionova.lesson_10.level_x.super_task_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ConcreteStrategySubtract implements Strategy{

    public int execute (int a, int b){
        System.out.println("Called ConcreteStrategySubtract's execute()");
        return a - b;
    }

}
