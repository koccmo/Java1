package student_igors_bartkevics.lesson_13.homework.level_5_middle_task_26_to_30.rules;

import student_igors_bartkevics.lesson_13.homework.level_5_middle_task_26_to_30.*;
import teacher.codereview.CodeReview;

import java.util.HashSet;
import java.util.Set;

@CodeReview(approved = true)
public class Rule5 extends Rule {
    private final DelimiterReplacer delimiterReplacer;
    private final Set<String> delimiters;
    private final String uniqueDelimiter;
    private final StringValidator stringValidator;
    private final ArrayValidator arrayValidator;

    public Rule5(Calculator calculator) {
        super(calculator);
        this.delimiterReplacer = new DelimiterReplacer();
        delimiters = new HashSet<>();
        delimiters.add(",");
        delimiters.add("\n");

        this.uniqueDelimiter = "_delimiter_";
        this.stringValidator = new StringValidator();
        this.arrayValidator = new ArrayValidator();
    }

    public Set<String> getDelimiters() {
        return delimiters;
    }

    @Override
    public String getName() {
        return "RULE-5";
    }

    @Override
    public boolean compliesWithRule(String string) {

        if (stringValidator.stringContainsDelimiters(string, delimiters) &&
                !stringValidator.stringStartsOrEndsWithAnyOfDelimiter(string, delimiters)) {

            string = delimiterReplacer.replaceDelimitersInStringWithUniqueDelimiter(delimiters, string, uniqueDelimiter);

            String[] numbers = string.split(uniqueDelimiter);

            return !arrayValidator.arrayContainsLessThanTwoElements(numbers) ||
                    !arrayValidator.arrayContainsNotDigit(numbers);
           }
        return false;
    }
}
