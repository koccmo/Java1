package student_igors_bartkevics.lesson_13.homework.level_5_middle_task_26_to_30.calculators;

import student_igors_bartkevics.lesson_13.homework.level_5_middle_task_26_to_30.Calculator;
import student_igors_bartkevics.lesson_13.homework.level_5_middle_task_26_to_30.DelimiterReplacer;

import java.util.HashSet;
import java.util.Set;

public class CalculatorImplRule5 implements Calculator {

    private final DelimiterReplacer delimiterReplacer;
    private final Set<String> delimiters;
    private final String uniqueDelimiter;

    public CalculatorImplRule5() {
        this.delimiterReplacer = new DelimiterReplacer();
        delimiters = new HashSet<>();
        delimiters.add(",");
        delimiters.add("\n");

        this.uniqueDelimiter ="_delimiter_";
    }

    @Override
    public int calculate(String numbers) {

        String string = delimiterReplacer.replaceDelimitersInStringWithUniqueDelimiter(delimiters, numbers, uniqueDelimiter);

        String[] numbersToCount = string.split(uniqueDelimiter);
        int result = 0;
        for (String number : numbersToCount) {
            for (int i = 0; i < number.length(); i ++) {
                result += Integer.parseInt(number.substring(i, i+1));
                }
            }
        return result;
        }
}
