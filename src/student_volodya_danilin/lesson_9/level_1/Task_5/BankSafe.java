package student_volodya_danilin.lesson_9.level_1.Task_5;


public class BankSafe {
    private int password;
    private int moneyAmount;
    private String[] errorCodes = {"Error 0 : Incorrect PinCode!"};

    public BankSafe(int password) {
        this.password = password;
        this.moneyAmount = 0;
    }

    void getMoney(int password, int withdrawAmount) {
        if (this.password == password) {
            moneyAmount -= withdrawAmount;
        }
        else {
            showError(0);
        }
    }

    void putMoney(int password, int depositAmount) {
        if (this.password == password) {
            moneyAmount += depositAmount;
        }
        else {
            showError(0);
        }
    }

    void showBalance(int password) {
        if (this.password == password) {
            System.out.println("Balance : " + this.moneyAmount);
        }
        else {
            showError(0);
        }
    }

    void showError(int errorCode) {
        System.out.println(errorCodes[errorCode]);
    }
}
