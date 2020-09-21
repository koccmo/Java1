package student_igors_bartkevics.lesson_13.homework.level_5_middle_task_26_to_30.rules;

import student_igors_bartkevics.lesson_13.homework.level_5_middle_task_26_to_30.Calculator;
import student_igors_bartkevics.lesson_13.homework.level_5_middle_task_26_to_30.Rule;

public class Rule2 extends Rule {

    public Rule2(Calculator calculator) {
        super(calculator);
    }

    @Override
    public String getName() {
        return "RULE-2";
    }

    @Override
    public boolean compliesWithRule(String string) {
        return (string.length() == 1) && Character.isDigit(string.charAt(0));
    }
}
