package student_anvars_intezars.home_tasks.lesson_9.level_2.task12;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class A {
    public A() {
        System.out.println("Class A Constructor");
    }
}

@CodeReview(approved = true)
class B extends A {
    public B() {
        System.out.println("Class B Constructor");
    }
}

@CodeReview(approved = true)
class C extends B {
    public C() {
        System.out.println("Class C Constructor");
    }
}



