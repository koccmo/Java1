package student_igors_bartkevics.lesson_13.homework.level_5_middle;

public abstract class Rule {

    private final Calculator calculator;

    public Rule(Calculator calculator) {
        this.calculator = calculator;
    }

    public Calculator getStringCalculator() {
        return this.calculator;
    }

    public abstract String getName();

    public abstract boolean compliesWithRule(String string);

}

