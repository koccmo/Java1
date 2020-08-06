package student_anvars_intezars.home_tasks.lesson_7.day_6.task11;

class CreditCard {

    private int cardNumber;
    private int pinCode;
    private int balance;
    private int creditLimit;
    private int creditDebt;
    private int amount;

    CreditCard(int cardNumber, int pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        balance = 0;
        creditDebt = 0;
        creditLimit = 1000;
    }

    public int getCreditCardNumber() {
        return cardNumber;
    }

    public int getCreditCardPinCode() {
        return pinCode;
    }

    public int withdraw(int pinCode, int amount) {
        int currentPinCode = getCreditCardPinCode();
        if (currentPinCode == pinCode) {
            System.out.println("Pin Code is OK");
        }else {
            System.out.println("Operation is declined. Incorrect Pin Code");
        }
        if ((balance <= 0) && (creditDebt < creditLimit)) {
            balance = balance + creditLimit;
            balance = balance - amount;
        }else {
            System.out.println("Withdraw is declined. Credit debt is higher than credit limit.");
        }
        System.out.println("Withdraw successful. You have used " + amount + " of your Credit Limit.");
        return balance;
    }

    public int deposit(int pinCode, int amount) {
        int currentPinCode = getCreditCardPinCode();
        if (currentPinCode == pinCode) {
            System.out.println("Pin Code is OK");
        }else {
            System.out.println("Operation is declined. Incorrect Pin Code");
        }
        if (creditDebt > 0) {
            creditDebt = creditDebt + amount;
        }else if (creditDebt == 0) {
            balance = balance + amount;
        }
        System.out.println("Deposit successful. You have deposited " + amount + " on your account.");
        return balance;
    }
}

