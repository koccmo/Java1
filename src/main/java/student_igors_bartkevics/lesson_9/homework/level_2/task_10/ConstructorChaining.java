/*
Дан класс ConstructorChaining.

class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    // допишите решение тут

}

Создайте в этом классе публичный конструктор с двумя параметрами.
Внутри этого конструктора первой строкой вызовите приватный конструктор с одним параметром.

Более подробно про этот подход можно прочитать: constructor chaining in Java. */
package student_igors_bartkevics.lesson_9.homework.level_2.task_10;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    // допишите решение тут
    public ConstructorChaining(String constructorName, int parameterCount) {
        this(constructorName);
        this.parameterCount = parameterCount;
    }
}
