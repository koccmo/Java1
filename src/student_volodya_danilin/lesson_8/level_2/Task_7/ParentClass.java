package student_volodya_danilin.lesson_8.level_2.Task_7;

public class ParentClass {
    protected int[] array;
    public int[] parentMethod(int number) {
        this.array = new int[number];
        return this.array;
    }
}

class ChildClass extends ParentClass{
    public static void main(String[] Args) {
        ParentClass parentClass = new ParentClass();
        parentClass.parentMethod(5);
    }

    void writeParent(int index, int value) {
        this.array[index] = value;
    }
}
 /*
 Класс-наследник только расширяет (дополняет) или изменяет функционал
 класса-родителя и не является самостоятельным классом, соответственно
 для работы класса-наследника необходимы инициализицации, производимые
 в базовом классе.
 aka чтобы у переменных были настоящие значения а не null.
  */