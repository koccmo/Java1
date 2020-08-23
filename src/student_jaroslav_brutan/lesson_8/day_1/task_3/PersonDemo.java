package student_jaroslav_brutan.lesson_8.day_1.task_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class PersonDemo {

    public static void main(String[] args) {
         Person person = new Person();

        System.out.println("Person's name is " + person.getFullName() + ", age is "
         + person.getAge() + " and adress is " + person.getAddress());
    }
}
