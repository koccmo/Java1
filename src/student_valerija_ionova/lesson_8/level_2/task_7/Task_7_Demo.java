package student_valerija_ionova.lesson_8.level_2.task_7;

/*/*Как вызвать конструктор родительского класса?
Когда это нужно делать?     Создавая дочерний класс вызывается конструктор родительского класса
Приведите пример кода.*/

public class Task_7_Demo extends Task_7{

    public String text;

    public Task_7_Demo (String name, String text){
        super (name);   //Вызов конструктора родительского класса
        this.text = text;
    }

}
