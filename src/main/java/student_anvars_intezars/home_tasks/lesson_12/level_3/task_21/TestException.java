package student_anvars_intezars.home_tasks.lesson_12.level_3.task_21;

class TestException extends Exception { }

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

/*
    После запуска тестово программы, резуельтат будет следующим:
    1. Got the Test Exception
    Inside finally block

 */
