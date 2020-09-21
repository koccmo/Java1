package student_igors_bartkevics.lesson_13.homework.level_5_middle_task_26_to_30.calculators;

import student_igors_bartkevics.lesson_13.homework.level_5_middle_task_26_to_30.Calculator;

public class CalculatorImplRule2 implements Calculator {

    @Override
    public int calculate(String numbers) {
        return Integer.parseInt(numbers);
    }
}
