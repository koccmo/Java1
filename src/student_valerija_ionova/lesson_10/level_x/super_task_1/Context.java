package student_valerija_ionova.lesson_10.level_x.super_task_1;

//Класс контекста использующий интерфейс стратегии

class Context {

    private Strategy strategy;

    //Constructor
    public Context(){
    }

    //Set new Strategy
    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b){
        return strategy.execute(a, b);
    }

}
