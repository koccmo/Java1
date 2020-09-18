package student_igors_bartkevics.lesson_13.homework.level_5_middle.rules;

import student_igors_bartkevics.lesson_13.homework.level_5_middle.Calculator;
import student_igors_bartkevics.lesson_13.homework.level_5_middle.Rule;

public class Rule1 extends Rule {

    public Rule1(Calculator calculator) {
        super(calculator);
    }

    @Override
    public String getName() {
        return "RULE-1";
    }

    @Override
    public boolean compliesWithRule(String string) {
        return string.isEmpty();
    }
}

