package student_roberts_kupcs.lesson_12.homework.level_3.Task_21;

//Какой результат мы получим?
//1. Got the Test Exception
//   Inside finally block
//
//2. Got the Test Exception
//
//3. Inside finally block
//
//4. Compiler Error


//1.  Got the Test Exception
//    Inside finally block

class TestException extends Exception{
}
class Main {
    public static void main(String args[]) {
        try {
            throw new TestException();
        } catch(TestException t) {
            System.out.println("Got the Test Exception");
        } finally {
            System.out.println("Inside finally block ");
        }
    }
}
