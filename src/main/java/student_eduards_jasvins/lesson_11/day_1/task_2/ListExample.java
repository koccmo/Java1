package student_eduards_jasvins.lesson_11.day_1.task_2;

import java.util.ArrayList;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(12);
        numbers.add(44);
        numbers.add(52);
        numbers.add(6);

        for (Integer number : numbers)
            System.out.println(number);

        System.out.println("List length = " + numbers.size());

        System.out.println("------------------");

        numbers.add(0, 100);

        for (Integer number : numbers)
        System.out.println(number);

        System.out.println("List length = " + numbers.size());
    }

}
