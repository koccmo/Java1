package student_vladislav_zagrebin.lesson_4.lessonExamples;

public class OrOperator {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        // | - or
        // || - or
        boolean result = (num1 > 10) && (num1 < -19);

        if ((num1 > 10) && (num1 > -19)) {
            System.out.println("Number 1!");

        }
    }
}