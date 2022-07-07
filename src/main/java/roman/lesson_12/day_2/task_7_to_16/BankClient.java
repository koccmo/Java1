package roman.lesson_12.day_2.task_7_to_16;

import java.util.Objects;

public class BankClient {

    private String uid;
    private String fullName;

    public BankClient (String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    public String getUid() {
        return this.uid;
    }

    public String getFullName() {
        return this.fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankClient that = (BankClient) o;
        return Objects.equals(uid, that.uid) && Objects.equals(fullName, that.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, fullName);
    }

    @Override
    public String toString() {
        return "BankClient{" +
                "uid='" + uid + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
