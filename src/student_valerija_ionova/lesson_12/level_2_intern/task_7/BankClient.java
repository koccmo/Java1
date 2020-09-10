package student_valerija_ionova.lesson_12.level_2_intern.task_7;

/*Task9
Для описания клиентов банка, данных к которым мы хотим дать доступ,
создайте класс BankClient:*/

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
    // созжайте конструктор класса, в котором вы получите значения указанных свойств

    // создайте get() методы для каждого из свойств

}