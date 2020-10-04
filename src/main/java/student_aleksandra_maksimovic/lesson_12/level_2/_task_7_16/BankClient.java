package student_aleksandra_maksimovic.lesson_12.level_2._task_7_16;

import java.util.Objects;

/*
Для описания клиентов банка, данных к которым мы хотим дать доступ,
создайте класс BankClient:
}
 */
class BankClient {

    private String uid;      // уникальный идентификатор клиета
    private String fullName; // полное имя клиента

    // создайте конструктор класса, в котором вы получите значения указанных свойств
    BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }
    // создайте get() методы для каждого из свойств

    public String getUid() {
        return uid;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        BankClient that = (BankClient) obj;
        return Objects.equals(uid, that.uid) &&
                Objects.equals(fullName, that.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, fullName);
    }
}