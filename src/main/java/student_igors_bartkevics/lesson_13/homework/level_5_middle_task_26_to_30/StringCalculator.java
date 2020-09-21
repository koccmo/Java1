package student_igors_bartkevics.lesson_13.homework.level_5_middle_task_26_to_30;

import student_igors_bartkevics.lesson_13.homework.level_5_middle_task_26_to_30.calculators.*;
import student_igors_bartkevics.lesson_13.homework.level_5_middle_task_26_to_30.rules.*;

import java.util.*;

class StringCalculator {

    private final Set<Rule> rules;


    StringCalculator() {

        rules = new HashSet<>();
        rules.add(new Rule1(new CalculatorImplRule1()));
        rules.add(new Rule2(new CalculatorImplRule2()));
        //rules.add(new Rule3(new CalculatorImplRule3()));
        rules.add(new Rule4(new CalculatorImplRule4()));
        rules.add(new Rule5(new CalculatorImplRule5()));
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
