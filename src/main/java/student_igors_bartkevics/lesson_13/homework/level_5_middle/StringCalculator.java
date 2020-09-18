package student_igors_bartkevics.lesson_13.homework.level_5_middle;

import student_igors_bartkevics.lesson_13.homework.level_5_middle.calculators.CalculatorImplRule1;
import student_igors_bartkevics.lesson_13.homework.level_5_middle.calculators.CalculatorImplRule2;
import student_igors_bartkevics.lesson_13.homework.level_5_middle.calculators.CalculatorImplRule3;
import student_igors_bartkevics.lesson_13.homework.level_5_middle.rules.Rule1;
import student_igors_bartkevics.lesson_13.homework.level_5_middle.rules.Rule2;
import student_igors_bartkevics.lesson_13.homework.level_5_middle.rules.Rule3;

import java.util.*;

class StringCalculator {

    private final Set<Rule> rules;

    StringCalculator() {
        rules = new HashSet<>();
        rules.add(new Rule1(new CalculatorImplRule1()));
        rules.add(new Rule2(new CalculatorImplRule2()));
        rules.add(new Rule3(new CalculatorImplRule3()));
    }

    int add(String numbers) {
        for (Rule rule : rules) {
            if (rule.compliesWithRule(numbers)) {
                return rule.getStringCalculator().calculate(numbers);
            }
        }
        return 0;
    }
}
