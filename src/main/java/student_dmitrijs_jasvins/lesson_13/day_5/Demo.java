package student_dmitrijs_jasvins.lesson_13.day_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Demo {
    public static void main(String[] args) {
        StringCalculator calculator = new StringCalculator();
        System.out.println(calculator.add("1\\n23,4"));
    }
}
