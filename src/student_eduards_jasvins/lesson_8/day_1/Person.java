package student_eduards_jasvins.lesson_8.day_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Person {

    private String fullName;
    private int age;
    private Address address;

    public void person() {
        System.out.println("Full name = " + fullName + ", Age = " + age + ", Address = " + address);
    }
}
