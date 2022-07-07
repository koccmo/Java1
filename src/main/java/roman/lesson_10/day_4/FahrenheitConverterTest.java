package roman.lesson_10.day_4;

public class FahrenheitConverterTest {
    public static void main(String[] args) {
        FahrenheitConverterTest test = new FahrenheitConverterTest();
        test.converterTest();
    }

    public void converterTest() {
        FahrenheitConverter converter = new FahrenheitConverter();
        double celsiusDegree = 10.0;
        checkResult(converter.converter(celsiusDegree) == 50.0,
                "Converter from celsius");
    }

    public void checkResult(boolean condition, String nameOfTest) {
        if(condition) {
            System.out.println(nameOfTest + " Test OK!");
        } else {
            System.out.println(nameOfTest + " Test FAIL!");
        }
    }
}
