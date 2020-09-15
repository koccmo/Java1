package student_aleksandra_maksimovic.lesson_10.level_4.task_11_12;

class KelvinConverterTest {
    public static void main(String[] args) {
        KelvinConverterTest test = new KelvinConverterTest();
        test.kelvinConverterTest();
    }
     public void checkResult(String name, boolean result) {
        if(result) {
            System.out.println(name + " = OK ");
        }
        else {
            System.out.println(name + " = FAIL");
        }
     }

    public void kelvinConverterTest() {
        KelvinConverter kelvinConverter = new KelvinConverter();

        checkResult("Celsius to kelvin test", kelvinConverter.convert(22) == 295.15);
    }
}
