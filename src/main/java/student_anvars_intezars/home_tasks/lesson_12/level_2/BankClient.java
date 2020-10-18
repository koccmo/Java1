package student_anvars_intezars.home_tasks.lesson_12.level_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BankClient {

    private String uid;
    private String fullName;


    public BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    public String getUid() {
        return uid;
    }


    public String getFullName() {
        return fullName;
    }
}
