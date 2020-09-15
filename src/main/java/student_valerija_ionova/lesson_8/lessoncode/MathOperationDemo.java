package student_valerija_ionova.lesson_8.lessoncode;

public class MathOperationDemo {

    public static void main (String [] args){

        Operation [] array = {new Sum(), new Subtract()};
        MathOperationHelper helper = new MathOperationHelper();
        helper.demo(array);
    }

}
