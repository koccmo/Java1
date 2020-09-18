package student_igors_bartkevics.lesson_13.homework.level_5_middle.calculators;

import student_igors_bartkevics.lesson_13.homework.level_5_middle.Calculator;

public class CalculatorImplRule2 implements Calculator {

    @Override
    public int calculate(String numbers) {
        return Integer.parseInt(numbers);
    }
}
