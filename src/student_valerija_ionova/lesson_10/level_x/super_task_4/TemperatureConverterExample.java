package student_valerija_ionova.lesson_10.level_x.super_task_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TemperatureConverterExample {

    public static void main (String [] args){

        Context context = new Context();

        context.setTemperatureConverter(new CelsiusConverter());
        double result = context.executeStrategy(25);
        System.out.println("Grad in Celsius " + result);

        context.setTemperatureConverter(new CelsiusToFahrenheitConverter());
        result = context.executeStrategy(25);
        System.out.println("25 grad in C = " + result + " in Fahrenheit");

        context.setTemperatureConverter(new CelsiusToKelvinConverter());
        result = context.executeStrategy(25);
        System.out.println("25 grad in C = " + result + " in Kelvin");

        context.setTemperatureConverter(new KelvinToCelsiusConverter());
        result = context.executeStrategy(230);
        System.out.println("250 grad in K = " + result + " in C");

        context.setTemperatureConverter(new FahrenheitToCelsius());
        result = context.executeStrategy(50);
        System.out.println("50 grad in F = " + result + " in C");

        context.setTemperatureConverter(new FahrenheitToKelvin());
        result = context.executeStrategy(50);
        System.out.println("50 grad in F = " + result + " in K");

        context.setTemperatureConverter(new KelvinToFahrenheit());
        result = context.executeStrategy(30);
        System.out.println("30 grad in K = " + result + " in F");
    }

}
