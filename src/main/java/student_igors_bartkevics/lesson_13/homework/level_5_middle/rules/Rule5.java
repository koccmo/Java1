package student_igors_bartkevics.lesson_13.homework.level_5_middle.rules;

import student_igors_bartkevics.lesson_13.homework.level_5_middle.*;

import java.util.ArrayList;
import java.util.List;

public class Rule5 extends Rule {
    private DelimiterReplacer delimiterReplacer;
    private List<String> splitters;
    private String uniqueSplitter;
    private StringValidator stringValidator;
    private ArrayValidator arrayValidator;

    public Rule5(Calculator calculator) {
        super(calculator);
        this.delimiterReplacer = new DelimiterReplacer();
        this.splitters = new ArrayList<>();
        splitters.add(",");
        splitters.add("\n");
        this.uniqueSplitter = "_splitter_";
        this.stringValidator = new StringValidator();
        this.arrayValidator = new ArrayValidator();
    }

    @Override
    public String getName() {
        return "RULE-5";
    }

    @Override
    public boolean compliesWithRule(String string) {

        if (stringValidator.stringContainsSplitters(string, splitters) &&
                !stringValidator.stringStartsOrEndsWithAnyOfSplitter(string, splitters)) {

            string = delimiterReplacer.replaceSplittersInStringWithUniqueSplitter(splitters, string, uniqueSplitter);

            String[] numbers = string.split(uniqueSplitter);

            return !arrayValidator.arrayContainsLessThanTwoElements(numbers) ||
                    !arrayValidator.arrayContainsNotDigit(numbers);
           }
        return false;
    }
}
