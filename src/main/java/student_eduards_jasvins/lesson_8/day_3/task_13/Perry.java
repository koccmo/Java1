package student_eduards_jasvins.lesson_8.day_3.task_13;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Perry extends Garry {

    private String otherName;


    public Perry(String nickName, int age, String otherName) {
        super(nickName, age);
        this.otherName = otherName;
    }

    @Override
    void helloMyFriend() {
        if (otherName == "Tommy") {
            System.out.println("I have one name and one nickname!");
        }else {
            System.out.println("I'm a normal person...");
        }

    }
}
