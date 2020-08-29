package student_igors_bartkevics.lesson_10.homework.level_4.task_11_12;

class KelvinConverterTest {

    public static void main(String[] args) {
        KelvinConverterTest test = new KelvinConverterTest();
        test.convertRightResultTest();
        test.convertWrongResultTest();
    }

    void convertRightResultTest() {
        TemperatureConverter converter = new KelvinConverter();
        double result = Math.round(converter.convert(23.4) * 100) / 100.0 ;
        checkResult(result == 296.55, "Kelvin converter right result");
    }

    void convertWrongResultTest() {
        TemperatureConverter converter = new KelvinConverter();
        double result = Math.round(converter.convert(23.4) * 100) / 100.0 ;
        checkResult(result != 296.56, "Kelvin converter wrong result");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

}
