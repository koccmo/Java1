package student_anvars_intezars.home_tasks.lesson_9.level_3.task_16;

public class SuperClassConstructorInvoker {

    public SuperClassConstructorInvoker() {
        super();
        System.out.println(1);
        System.out.println(2);
    }
}
/*/
    Ошибка заключалась в том, чтр "super()" должен был стоять первым
    первым в теле консткруктора
 */
