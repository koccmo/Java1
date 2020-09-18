package student_igors_bartkevics.lesson_13.homework.level_5_middle.rules;

import student_igors_bartkevics.lesson_13.homework.level_5_middle.Calculator;
import student_igors_bartkevics.lesson_13.homework.level_5_middle.Rule;

public class Rule4 extends Rule {

    public Rule4(Calculator calculator) {
        super(calculator);
    }

    @Override
    public String getName() {
        return "RULE-4";
    }

    @Override
    public boolean compliesWithRule(String string) {
        if (string.startsWith(",") || string.endsWith(",")) {
            return false;
        }
        String[] numbers = string.split(",");
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

        return true;
    }
}
