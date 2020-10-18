package student_volodya_danilin.lesson_12.level_2.Task_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BankClient {

    private String uid;
    private String fullName;

    BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUid() {
        return uid;
    }
}
