package student_alexey_tretyakov.lesson_9.homework.level_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class SafeBoxDemo {

    public static void main(String[] args) {
        SafeBox safeBox = new SafeBox();
        System.out.println("Pin code is " + safeBox.pinCode);
        System.out.println("Money in safe =  " + safeBox.boxMoney);

    }

}
