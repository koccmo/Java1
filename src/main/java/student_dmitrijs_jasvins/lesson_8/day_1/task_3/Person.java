package student_dmitrijs_jasvins.lesson_8.day_1.task_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Person {


    private String fullName;
    private int age;
    private Address address;

    public void information (){
        System.out.println("Full name : " + fullName + ", Age : " + age + " ,Address : " + address);
    }
}
