package student_igors_bartkevics.lesson_13.homework.level_5_middle.rules;

import student_igors_bartkevics.lesson_13.homework.level_5_middle.Calculator;
import student_igors_bartkevics.lesson_13.homework.level_5_middle.Rule;
import student_igors_bartkevics.lesson_13.homework.level_5_middle.DelimiterReplacer;

import java.util.ArrayList;
import java.util.List;

public class Rule5 extends Rule {
    private DelimiterReplacer delimiterReplacer;

    public Rule5(Calculator calculator) {
        super(calculator);
        this.delimiterReplacer = new DelimiterReplacer();
    }

    @Override
    public String getName() {
        return "RULE-5";
    }

    @Override
    public boolean compliesWithRule(String string) {
        List<String> splitters = new ArrayList<>();
        splitters.add(",");
        splitters.add("\n");

        boolean result = false;
        for (String splitter : splitters) {

            if (string.contains(splitter)) {
                result = true;
                if (stringStartsOrEndsWithSplitter(string,splitter)) {
                    return false;
                }
            }
        }

        String uniqueSplitter = "_splitter_";
        string = delimiterReplacer.replaceSplittersInStringWithUniqueSplitter(splitters, string, uniqueSplitter);

        String[] numbers = string.split(uniqueSplitter);
        if ( numbers.length < 2) {
            return false;
        }
        for (String number : numbers) {
            for (int i = 0; i < number.length(); i ++) {
                if (!Character.isDigit(number.charAt(i))) {
                    return false;
                }
            }
        }
        return result;
    }

    private boolean stringStartsOrEndsWithSplitter(String string, String splitter) {
        return (string.startsWith(splitter) || string.endsWith(splitter));
    }
}
