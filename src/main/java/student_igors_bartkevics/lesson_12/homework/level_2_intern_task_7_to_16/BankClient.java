/*
Task_9:
Для описания клиентов банка, данных к которым мы хотим дать доступ,
создайте класс BankClient:

class BankClient {

    private String uid;      // уникальный идентификатор клиета
    private String fullName; // полное имя клиента

    // созжайте конструктор класса, в котором вы получите значения указанных свойств

    // создайте get() методы для каждого из свойств

}
 */
package student_igors_bartkevics.lesson_12.homework.level_2_intern_task_7_to_16;

import java.util.Objects;

class BankClient {

    private String uid;      // уникальный идентификатор клиета
    private String fullName; // полное имя клиента

    // созжайте конструктор класса, в котором вы получите значения указанных свойств
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
