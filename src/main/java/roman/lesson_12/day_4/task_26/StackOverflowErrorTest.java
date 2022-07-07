package roman.lesson_12.day_4.task_26;

public class StackOverflowErrorTest {
    public static void main(String[] args) {
        StackOverflowErrorTest test = new StackOverflowErrorTest();
        test.printX();

    }

    void printNumber(int number){
        System.out.println("Number : " + number);
        if (number == 0) {
            return;
        } else {
            printNumber(++number);
        }
    }

    void printX () {
        printX();
    }
}
