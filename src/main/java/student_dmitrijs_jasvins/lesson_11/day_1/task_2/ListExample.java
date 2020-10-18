package student_dmitrijs_jasvins.lesson_11.day_1.task_2;

import java.util.ArrayList;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ListExample {
        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(8);
            numbers.add(11);
            numbers.add(55);
            numbers.add(52);
            numbers.add(7);

            for (Integer number : numbers)
                System.out.println(number);

            System.out.println("List length = " + numbers.size());

            System.out.println("");

            numbers.add(0, 100);

            for (Integer number : numbers)
                System.out.println(number);

            System.out.println("List length = " + numbers.size());
        }
}
