package student_eduards_jasvins.lesson_8.day_6;

public class VaragsTest {
    public static void main(String[] args) {
        VaragsTest varagsTest = new VaragsTest();
        varagsTest.sumFiveNumbers();
    }

    private void sumFiveNumbers() {
        Varags varags = new Varags();
        System.out.println(varags.sumNumbers(1,3,6,9,5));
    }
}
