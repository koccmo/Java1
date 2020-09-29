package student_valerija_ionova.lesson_12.level_2_intern.task_7_16;

/*Task9
Для описания клиентов банка, данных к которым мы хотим дать доступ,
создайте класс BankClient:*/

import java.util.Objects;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BankClient {

    private String uid;      // уникальный идентификатор клиета
    private String fullName; // полное имя клиента

    BankClient (String uid, String fullName){
        this.uid = uid;
        this.fullName = fullName;
    }

    String getUid(){
        return uid;
    }

    String getFullName(){
        return fullName;
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
    // созжайте конструктор класса, в котором вы получите значения указанных свойств

    // создайте get() методы для каждого из свойств

}