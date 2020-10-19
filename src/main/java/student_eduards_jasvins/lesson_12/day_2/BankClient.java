package student_eduards_jasvins.lesson_12.day_2;

import java.util.Objects;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BankClient {

    private String uid;
    private String fullName;

    BankClient (String uid, String fullName) {
        this.fullName = fullName;
        this.uid = uid;
    }

    String getFullName() { return fullName; }
    String getUid () { return uid; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankClient that = (BankClient) o;
        return Objects.equals(uid, that.uid) &&
                Objects.equals(fullName, that.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, fullName);
    }
}
