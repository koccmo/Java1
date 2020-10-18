package student_volodya_danilin.lesson_13.level_5;

class StringCalculator {

    int add(String numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length(); i++) {
            if (Character.isDigit(numbers.charAt(i))) {
                sum += Character.getNumericValue(numbers.charAt(i));
            }
        }
        return sum;
    }
}
