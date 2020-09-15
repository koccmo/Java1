package student_valerija_ionova.lesson_10.level_4.task_11_12.v1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ConvertTemperatureTest {

    public static void main (String [] args){

        ConvertTemperatureTest convertTemperatureTest = new ConvertTemperatureTest();

        convertTemperatureTest.testCelsiusToKelvin();
        convertTemperatureTest.testCelsiusToFahrenheit();
    }

    void printResult(String name, boolean testPassed){
        if (testPassed){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    void testCelsiusToKelvin(){
        CelsiusToKelvin celsiusToKelvin = new CelsiusToKelvin();

        printResult("testCelsiusToKelvin", celsiusToKelvin.convert(25) == 298.15);
    }

    void testCelsiusToFahrenheit(){
        CelsiusToFahrenheit celsiusToFahrenheit = new CelsiusToFahrenheit();

        printResult("testCelsiusToFahrenheit", celsiusToFahrenheit.convert(25) == 77);
    }


}
