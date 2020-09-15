package student_vladislav_zagrebin.lesson_5.lessonExamples;

public class ForExample {

    public static void main(String[] args) {
        int i = 1; // for first part

        if(i < 100) {
            System.out.println(i);
            i++;
        }

        // for (счётчик с начальным числом ; условие, до которого идёт цикл ; ++ или --) {
        // }

        for (int j = 1; j < 100; j++) {
            System.out.println(j);
        }

        for (int j = 100; j > 0; j--) {
            System.out.println(j);
        }
    }
}
