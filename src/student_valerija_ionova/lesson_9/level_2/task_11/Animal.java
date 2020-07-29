package student_valerija_ionova.lesson_9.level_2.task_11;

/*Создайте иерархию наследования из двух уровней (родительский и дочерний).
Продемонстрируйте использование протектед конструктора в родительском классе.
Продемонстрируйте вызов протектед конструктора из класса потомка.*/

class Animal {

    private String type;

    protected Animal (String type){
        this.type = type;
    }
}
