package student_valerija_ionova.lesson_8.lessoncode;

public class MathOperationHelper {

    void demo(Operation [] operations){
        for (Operation operation : operations){
            System.out.println(operation.operation(10, 5));
        }
    }
}
