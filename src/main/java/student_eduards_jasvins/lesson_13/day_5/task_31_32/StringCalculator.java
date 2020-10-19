package student_eduards_jasvins.lesson_13.day_5.task_31_32;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class StringCalculator {

    public int addNumb(String numbers) {
        List<Integer> listNumber = createNumberList(numbers);
        int sum  = 0;
        for (Integer number : listNumber) {
            sum += number;
        }
        return sum;
    }

    public int addDigit(String numbers) {
        int sum  = 0;
        for (int i = 0; i < numbers.length(); i++) {
            if (Character.isDigit(numbers.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(numbers.charAt(i)));
            }
        }
        return sum;
    }

    private List <Integer> createNumberList(String text) {

        List <Integer> numbers = new ArrayList<>();

        String number = "";
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                number += text.charAt(i);
            } else {
                if (number.length() != 0) {
                    numbers.add(Integer.parseInt(number));
                    number = "";
                }
            }
        }
        if (number.length() != 0) numbers.add(Integer.parseInt(number));
        return numbers;
    }
}
