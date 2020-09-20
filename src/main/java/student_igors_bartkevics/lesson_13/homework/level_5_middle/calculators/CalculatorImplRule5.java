package student_igors_bartkevics.lesson_13.homework.level_5_middle.calculators;

import student_igors_bartkevics.lesson_13.homework.level_5_middle.Calculator;
import student_igors_bartkevics.lesson_13.homework.level_5_middle.SplitterReplacer;

import java.util.ArrayList;
import java.util.List;

public class CalculatorImplRule5 implements Calculator {

    private SplitterReplacer splitterReplacer;

    public CalculatorImplRule5() {
        this.splitterReplacer = new SplitterReplacer();
    }

    @Override
    public int calculate(String numbers) {

        List<String> splitters = new ArrayList<>();
        splitters.add(",");
        splitters.add("\n");

        String uniqueSplitter = "_splitter_";
        String string = splitterReplacer.replaceSplittersInStringWithUniqueSplitter(splitters, numbers, uniqueSplitter);

        String[] numbersToCount = string.split(uniqueSplitter);
        int result = 0;
        for (String number : numbersToCount) {
            for (int i = 0; i < number.length(); i ++) {
                result += Integer.parseInt(number.substring(i, i+1));
                }
            }
        return result;
        }
}
