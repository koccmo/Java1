package student_valerija_ionova.lesson_10.level_x.super_task_1;

class StrategyExample {

    public static void main (String [] args){

        Context context = new Context();

        context.setStrategy(new ConcreteStrategyAdd());
        int resultA = context.executeStrategy(3, 4);

        context.setStrategy(new ConcreteStrategySubtract());
        int resultB = context.executeStrategy(3, 4);

        context.setStrategy(new ConcreteStrategyMultiply());
        int resultC = context.executeStrategy(3, 4);

        System.out.println("ResultA = " + resultA);
        System.out.println("ResultB = " + resultB);
        System.out.println("ResultC = " + resultC);

    }

}
