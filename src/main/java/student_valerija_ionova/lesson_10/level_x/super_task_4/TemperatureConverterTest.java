package student_valerija_ionova.lesson_10.level_x.super_task_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TemperatureConverterTest {

    public static void main (String [] args){

        TemperatureConverterTest temperatureConverterTest = new TemperatureConverterTest();

        temperatureConverterTest.testFC();
        temperatureConverterTest.testFK();
        temperatureConverterTest.testF();
        temperatureConverterTest.testKC();
        temperatureConverterTest.testKF();
        temperatureConverterTest.testK();
        temperatureConverterTest.testC();
        temperatureConverterTest.testCK();
        temperatureConverterTest.testCF();

    }

    void printResult (String name, boolean testPassed){
        if (testPassed){
            System.out.println(name + " OK");
        }else{
            System.out.println(name + " FAIL");
        }
    }


    void testFC (){
        Context context = new Context();
        context.setTemperatureConverter(new FahrenheitToCelsius());
        double result = context.executeStrategy(50);
        printResult("testFC", result == 10);
    }

    void testFK (){
        Context context = new Context();
        context.setTemperatureConverter(new FahrenheitToKelvin());
        double result = context.executeStrategy(50);
        printResult("testFK", result == 283);
    }

    void testF (){
        Context context = new Context();
        context.setTemperatureConverter(new FahrenheitConverter());
        double result = context.executeStrategy(50);
        printResult("testF", result == 50);
    }

    void testKC (){
        Context context = new Context();
        context.setTemperatureConverter(new KelvinToCelsiusConverter());
        double result = context.executeStrategy(50);
        printResult("testKC", result == - 223);
    }

    void testKF (){
        Context context = new Context();
        context.setTemperatureConverter(new KelvinToFahrenheit());
        double result = context.executeStrategy(50);
        printResult("testKF", result == -370);
    }

    void testK (){
        Context context = new Context();
        context.setTemperatureConverter(new KelvinConverter());
        double result = context.executeStrategy(50);
        printResult("testF", result == 50);
    }

    void testCK (){
        Context context = new Context();
        context.setTemperatureConverter(new CelsiusToKelvinConverter());
        double result = context.executeStrategy(50);
        printResult("testCK", result == 323);
    }

    void testCF (){
        Context context = new Context();
        context.setTemperatureConverter(new CelsiusToFahrenheitConverter());
        double result = context.executeStrategy(50);
        printResult("testCF", result == 122);
    }

    void testC (){
        Context context = new Context();
        context.setTemperatureConverter(new CelsiusConverter());
        double result = context.executeStrategy(50);
        printResult("testC", result == 50);
    }



}
