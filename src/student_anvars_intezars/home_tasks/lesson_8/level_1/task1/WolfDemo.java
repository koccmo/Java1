package student_anvars_intezars.home_tasks.lesson_8.level_1.task1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class WolfDemo {

    public static void main(String[] args) {

        Wolf blackFang = new Wolf();
        blackFang.setAge(3);
        blackFang.getAge();

        System.out.println("My cat is " + blackFang.getAge() + " years old");
    }
}
