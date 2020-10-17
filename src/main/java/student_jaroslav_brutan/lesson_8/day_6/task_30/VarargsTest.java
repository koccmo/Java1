package student_jaroslav_brutan.lesson_8.day_6.task_30;

public class VarargsTest {

    public static void main(String[] args) {

        VarargsTest test = new VarargsTest();
        test.testOfSum();
    }

    public void testOfSum(){
        Varargs varargs = new Varargs();
        if (varargs.sumOfAll(2,3,4,5,6) == 20){
            System.out.println("Test - OK!");
        } else {
            System.out.println("Test - FAIL!");
        }
    }


}
