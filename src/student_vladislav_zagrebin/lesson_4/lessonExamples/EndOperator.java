package student_vladislav_zagrebin.lesson_4.lessonExamples;

public class EndOperator {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        // & - and
        // && - and
        boolean firstNumberBiggerThanSecond = num1 > num2;
        boolean firstNumberBiggerThanThird = num1 > num3;
        boolean firstNumberIsGreater = (firstNumberBiggerThanSecond && firstNumberBiggerThanThird);

        if (firstNumberBiggerThanSecond && firstNumberBiggerThanThird) {
            System.out.println("Number 1 is bigger than 2 and 3");

        }
    }
}
