package student_aleksandra_maksimovic.lesson_9.level_2.task_11;
/*
Создайте иерархию наследования из двух уровней (родительский и дочерний).
Продемонстрируйте использование протектед конструктора в родительском классе.
Продемонстрируйте вызов протектед конструктора из класса потомка.
 */

class Human {

    private String profession;

    protected Human (String profession) {
        this.profession = profession;
    }

}
