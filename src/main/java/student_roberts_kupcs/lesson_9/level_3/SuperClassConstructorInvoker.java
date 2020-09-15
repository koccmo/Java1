package student_roberts_kupcs.lesson_9.level_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class SuperClassConstructorInvoker {
    public SuperClassConstructorInvoker() {
        //Вызов 'super ()' должен быть первым оператором в теле конструктора

        super();

        System.out.println(1);
        System.out.println(2);
    }
}
