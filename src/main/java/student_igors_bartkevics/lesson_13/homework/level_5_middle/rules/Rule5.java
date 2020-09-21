package student_igors_bartkevics.lesson_13.homework.level_5_middle.rules;

import student_igors_bartkevics.lesson_13.homework.level_5_middle.*;

import java.util.ArrayList;
import java.util.List;

public class Rule5 extends Rule {
    private final DelimiterReplacer delimiterReplacer;
    private final List<String> delimiters;
    private final String uniqueDelimiter;
    private final StringValidator stringValidator;
    private final ArrayValidator arrayValidator;

    public Rule5(Calculator calculator) {
        super(calculator);
        this.delimiterReplacer = new DelimiterReplacer();
        this.delimiters = new ArrayList<>();
        delimiters.add(",");
        delimiters.add("\n");
        this.uniqueDelimiter = "_delimiter_";
        this.stringValidator = new StringValidator();
        this.arrayValidator = new ArrayValidator();
    }

    @Override
    public String getName() {
        return "RULE-5";
    }

    @Override
    public boolean compliesWithRule(String string) {

        if (stringValidator.stringContainsSplitters(string, delimiters) &&
                !stringValidator.stringStartsOrEndsWithAnyOfSplitter(string, delimiters)) {

            string = delimiterReplacer.replaceDelimitersInStringWithUniqueDelimiter(delimiters, string, uniqueDelimiter);

            String[] numbers = string.split(uniqueDelimiter);

            return !arrayValidator.arrayContainsLessThanTwoElements(numbers) ||
                    !arrayValidator.arrayContainsNotDigit(numbers);
           }
        return false;
    }
}
