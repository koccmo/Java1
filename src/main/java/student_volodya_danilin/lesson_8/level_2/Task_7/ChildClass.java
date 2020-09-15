package student_volodya_danilin.lesson_8.level_2.Task_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ChildClass extends ParentClass {

    int level = 222;


    public ChildClass(int age, String name, int level) {
        super(age, name); // вызов конструктора-родителя
        this.level = level;
    }

    void tell() {
        System.out.println("Age : " + super.ageParent);
        System.out.println("Name : " + super.nameParent);
        System.out.println("Level : " + level);
    }
}

 /*
 Класс-наследник только расширяет (дополняет) или изменяет функционал
 класса-родителя и не является самостоятельным классом, соответственно
 для работы класса-наследника необходимы инициализицации, производимые
 в базовом классе.
 aka чтобы у переменных были настоящие значения а не null.
  */