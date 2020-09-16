package student_eduards_jasvins.lesson_10.day_3.task_6;

// Функциональный интерфейс в Java – это интерфейс, который содержит только 1 абстрактный метод.
// Основное назначение – использование в лямбда выражениях и method reference.

import teacher.codereview.CodeReview;

@FunctionalInterface
@CodeReview(approved = true)
public interface Functional {
    boolean functional(Integer value);

}
