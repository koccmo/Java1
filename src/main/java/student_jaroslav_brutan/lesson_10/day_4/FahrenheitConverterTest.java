package student_jaroslav_brutan.lesson_10.day_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class FahrenheitConverterTest {

    public static void main(String[] args) {
        FahrenheitConverterTest test = new FahrenheitConverterTest();
        test.fahrenheitTest();
    }

    void fahrenheitTest(){
        FahrenheitConverter converter = new FahrenheitConverter();
        boolean result = converter.convert(20) == 68;
        if (result){
            System.out.println("Test - OK!");
        } else {
            System.out.println("Test - FAIL!");
        }
    }
}
