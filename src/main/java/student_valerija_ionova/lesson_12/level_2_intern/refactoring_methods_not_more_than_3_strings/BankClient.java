package student_valerija_ionova.lesson_12.level_2_intern.refactoring_methods_not_more_than_3_strings;

import java.util.Objects;

class BankClient {

    private String uid;
    private String fullName;

    BankClient (String uid, String fullName){
        this.uid = uid;
        this.fullName = fullName;
    }

    String getUid (){
        return uid;
    }

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
