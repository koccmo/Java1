package student_igors_bartkevics.lesson_13.homework.level_5_middle_task_26_to_30.calculators;

import student_igors_bartkevics.lesson_13.homework.level_5_middle_task_26_to_30.Calculator;

public class CalculatorImplRule4 implements Calculator {

    @Override
    public int calculate(String numbers) {
        String[] numbersToCount = numbers.split(",");
        int result = 0;
        for (String number : numbersToCount) {
            for (int i = 0; i < number.length(); i ++) {
                result += Integer.parseInt(number.substring(i, i+1));
                }
            }
        return result;
    }
}
