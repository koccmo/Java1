package roman.lesson_10.day_4;

public class KelvinConverterTest {
    public static void main(String[] args) {
        KelvinConverterTest test = new KelvinConverterTest();
        test.kelvinConvertorTest();
    }

    public void kelvinConvertorTest() {
        KelvinConverter kelvin = new KelvinConverter();
        checkResult(kelvin.converter(10.0) == 283.15,
                "Kelvin Converter");
    }

    public void checkResult(boolean condition, String nameOfTest) {
        if(condition) {
            System.out.println(nameOfTest + " Test OK!");
        } else {
            System.out.println(nameOfTest + " Test FAIL!");
        }
    }
}
