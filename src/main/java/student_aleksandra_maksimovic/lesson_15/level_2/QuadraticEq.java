package student_aleksandra_maksimovic.lesson_15.level_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class QuadraticEq {

    public List<Double> calc(double a, double b, double c) {
        double discriminant = countDiscriminant(a, b, c);

        if (discriminant > 0) {
            return countRootsDiscriminantMoreThenZero(a, b, discriminant);
        }
        else if (discriminant == 0) {
            return countRootsDiscriminantEqualsZero(a, b);
        }
        else {
            return countRootsDiscriminantLessThenZero();
        }
    }

    private double countDiscriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    private List<Double> countRootsDiscriminantMoreThenZero(double a, double b, double discriminant) {
        double x1, x2;
        x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
        return Arrays.asList(x1, x2);
    }

    private List<Double> countRootsDiscriminantEqualsZero(double a, double b) {
        double x;
        x = -b / (2 * a);
        return Arrays.asList(x);
    }

    private List<Double> countRootsDiscriminantLessThenZero() {
        return new ArrayList<>();
    }
}
