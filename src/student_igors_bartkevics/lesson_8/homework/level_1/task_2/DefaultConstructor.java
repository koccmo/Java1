/*
Нужно ли в классе создавать дефолтный конструктор
или Java его автоматически добавит при компиляции
кода? Ответьте на вопрос примером кода!
 */
package student_igors_bartkevics.lesson_8.homework.level_1.task_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DefaultConstructor {

    private String overview;

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getOverview() {
        return overview;
    }
}

