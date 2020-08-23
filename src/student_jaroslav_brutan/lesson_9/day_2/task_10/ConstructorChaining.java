package student_jaroslav_brutan.lesson_9.day_2.task_10;

class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName){
        this.constructorName = constructorName;
    }

    public ConstructorChaining(String constructorName, int parameterCount) {
        this(constructorName);
        this.parameterCount = parameterCount;

    }
}
