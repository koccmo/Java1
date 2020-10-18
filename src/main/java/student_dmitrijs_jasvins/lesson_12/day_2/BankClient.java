package student_dmitrijs_jasvins.lesson_12.day_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class BankClient {
    private String uid;
    private String fullName;

    public BankClient(String uid, String fullName) {
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
