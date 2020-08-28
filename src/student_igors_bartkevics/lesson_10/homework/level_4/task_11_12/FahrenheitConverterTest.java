package student_igors_bartkevics.lesson_10.homework.level_4.task_11_12;

class FahrenheitConverterTest {

    public static void main(String[] args) {
        FahrenheitConverterTest test = new FahrenheitConverterTest();
        test.convertRightResultTest();
        test.convertWrongResultTest();
    }

    void convertRightResultTest() {
        TemperatureConverter converter = new FahrenheitConverter();
        double result = Math.round(converter.convert(23.4) * 100) / 100.0 ;
        checkResult(result == 74.12, "Fahrenheit converter right result");
    }

    void convertWrongResultTest() {
        TemperatureConverter converter = new FahrenheitConverter();
        double result = Math.round(converter.convert(23.4) * 100) / 100.0 ;
        checkResult(result != 74.13, "Fahrenheit converter wrong result");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

}
