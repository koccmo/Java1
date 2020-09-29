package student_roberts_kupcs.lesson_10.level_4.Task_12;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TemperaturConverterTest {
    public static void main(String[] args) {

        TemperaturConverterTest test = new TemperaturConverterTest();
        test.CelsiusConverterTest();
        test.FahrenheitConverter();
    }

    void CelsiusConverterTest() {
        KelvinConverter kelvinConverter = new KelvinConverter();
        if (kelvinConverter.convert(10) == 283.15) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }
    }

    void FahrenheitConverter() {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        if (fahrenheitConverter.convert(3) == 37.4) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }
    }

}
