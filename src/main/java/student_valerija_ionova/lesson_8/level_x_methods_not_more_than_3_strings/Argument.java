package student_valerija_ionova.lesson_8.level_x_methods_not_more_than_3_strings;

class Argument extends MathOperation{

    private double argument;

    Argument (double argument){
        this.argument = argument;
    }

    @Override
    public double calculate() {
        return argument;
    }
}
