package student_valerija_ionova.lesson_10.level_x.super_task_1;

class ConcreteStrategyMultiply implements  Strategy{

    public int execute (int a, int b){
        System.out.println("Called ConcreteStrategyMultiply's execute()");
        return a * b;
    }

}