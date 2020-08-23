package student_aleksandra_maksimovic.lesson_8.level_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class VarArgsTest {
    public static void main(String[] args) {

        VarArgs obj = new VarArgs();

        System.out.println(obj.addAll(1,2));
        System.out.println(obj.addAll(1,2,3));

    }
}
