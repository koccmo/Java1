package student_igors_bartkevics.lesson_13.homework.level_5_middle.rules;

import student_igors_bartkevics.lesson_13.homework.level_5_middle.Calculator;
import student_igors_bartkevics.lesson_13.homework.level_5_middle.Rule;

public class Rule3 extends Rule {

    public Rule3(Calculator calculator) {
        super(calculator);
    }

    @Override
    public String getName() {
        return "RULE-3";
    }

    @Override
    public boolean compliesWithRule(String string) {
        return (string.length() == 3) && Character.isDigit(string.charAt(0)) &&
                string.charAt(1) == ',' &&
                Character.isDigit(string.charAt(2));
    }
}
