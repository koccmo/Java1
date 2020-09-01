package student_anvars_intezars.home_tasks.lesson_9.level_2.task10;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining (String constructorName, int parameterCount) {
        @CodeReviewComment(teacher = "Зачем тут создавать новую инстанцию?")
        @CodeReviewComment(teacher = "Constructor chaining = this(constructorName);")
        @CodeReviewComment(teacher = "Constructor chaining = это вызов другого конструктора в том же классе.")
    	ConstructorChaining constructorChaining  = new ConstructorChaining(constructorName);
        this.constructorName = constructorName;
        this.parameterCount= parameterCount;
    }
}
