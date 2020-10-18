package student_dmitrijs_jasvins.lesson_13.day_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class StringCalculator {
    public int add(String numbers) {
        int sum = 0;

        if (numbers.isEmpty()) {
            return 0;
        }

        int[] digits = findDigits(numbers);

        for (int number : digits) {
            sum += number;
        }

        return sum;
    }

    private static int[] findDigits(String numbers) {
        int length = numbers.length();
        int count = 0;
        char[] charArray = numbers.toCharArray();
        int[] result = new int[length];
        for (char tempChar : charArray) {
            if (Character.isDigit(tempChar)) {
                result[count++] = Integer.parseInt(Character.toString(tempChar));
            }
        }
        return result;
    }
}
