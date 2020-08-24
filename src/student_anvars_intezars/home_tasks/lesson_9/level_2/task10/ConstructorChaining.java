package student_anvars_intezars.home_tasks.lesson_9.level_2.task10;

class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining (String constructorName, int parameterCount) {
        ConstructorChaining constructorChaining  = new ConstructorChaining(constructorName);
        this.constructorName = constructorName;
        this.parameterCount= parameterCount;
    }
}
