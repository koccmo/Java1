package student_jaroslav_brutan.lesson_10.day_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class KelvinConverterTest {

    public static void main(String[] args) {
        KelvinConverterTest test = new KelvinConverterTest();
        test.kelvinConverter();
    }

    void kelvinConverter(){
        KelvinConverter converter = new KelvinConverter();
        boolean result = converter.convert(20) == 293.15;
        if (result){
            System.out.println("Test - OK!");
        } else {
            System.out.println("Test - FAIL!");
        }
    }
}
