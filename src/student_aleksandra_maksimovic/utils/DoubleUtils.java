package student_aleksandra_maksimovic.utils;

public class DoubleUtils {
    public static boolean equals(double left, double right) {
        return Math.abs(left - right) < 1e-6;
    }
}
