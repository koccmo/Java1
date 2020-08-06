/*
Что такое дефолтный конструктор класса?
Создайте класс и в нём объявите дефолтный конструктор.
Создайте класс Demo и продемонстрируйте вызов
дефолтного конструктора.
 */
package student_igors_bartkevics.lesson_8.homework.level_1.task_1;

class DefaultConstructor {

    private String overview;

    public DefaultConstructor() {
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getOverview() {
        return overview;
    }
}

