package student_alexey_tretyakov.special;

public class Tester {
    public void testResult(boolean status, String testingString ) {
        if (status) {
            System.out.println( testingString + " Test OK.");
        } else {
            System.out.println( testingString + " Test FAIL!!!");
        }
    }
}
