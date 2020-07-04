package student_aleksandra_maksimovic.testing;

public class Tester {

    public void check(boolean cond, String desc) {
        if (cond) {
            System.out.println(desc + ": PASSED");
        } else {
            System.out.println(desc + ": FAILED");
        }
    }

    public void checkFalse(boolean cond, String desc) {
        if (!cond) {
            System.out.println(desc + ": PASSED");
        } else {
            System.out.println(desc + ": FAILED");
        }
    }

}
