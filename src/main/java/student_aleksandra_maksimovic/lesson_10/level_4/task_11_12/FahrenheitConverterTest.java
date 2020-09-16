package student_aleksandra_maksimovic.lesson_10.level_4.task_11_12;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FahrenheitConverterTest {
     public static void main(String[] args) {
         FahrenheitConverterTest test = new FahrenheitConverterTest();
         test.fahrenheitConverterTest();

     }

     public void checkResult(String name, boolean result) {
         if(result) {
             System.out.println( name + " = OK ");
         }
         else {
             System.out.println(name + " = FAIL");
         }
     }

     public void fahrenheitConverterTest() {
         FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();

         checkResult("celsius to fahrenheit converter test ", fahrenheitConverter.convert(22) == 71.6);
     }
}
