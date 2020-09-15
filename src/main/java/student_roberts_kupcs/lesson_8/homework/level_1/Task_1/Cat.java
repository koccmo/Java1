package student_roberts_kupcs.lesson_8.homework.level_1.Task_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Cat extends Animal {
    public Cat() {
        System.out.println("Отработал конструктор Cat!");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
    }

}