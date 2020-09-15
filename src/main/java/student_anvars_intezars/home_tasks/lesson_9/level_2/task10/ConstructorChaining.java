package student_anvars_intezars.home_tasks.lesson_9.level_2.task10;

import teacher.codereview.CodeReview;

@CodeReview(approved = false)
//Исправлено. В этом же классе создал другой конструктор.
class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    private ConstructorChaining(int parameterCount) {
        this.parameterCount = parameterCount;
    }



}
