package student_volodya_danilin.lesson_7.level_6;

import java.util.Scanner;

public class CreditCard {
    protected int cardNumber;
    protected int pinCode;
    protected int balance;
    protected int creditLimit;
    protected int creditDebt;
    protected String[] errorCodes = {"Error 0 : Not enough money on your account! Aborting action...",
                                     "Error 1 : Incorrect login details! Aborting action..."};

    public CreditCard(int cardNumber, int pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.balance = 0;
        this.creditDebt = 0;
        this.creditLimit = 0;

    }

    public int getCardNumber() {
        return cardNumber;
    }

    public int getPinCode() {
        return pinCode;
    }

    public int getBalance() {
        return balance;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public int getCreditDebt() {
        return creditDebt;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setCreditDebt(int creditDebt) {
        this.creditDebt = creditDebt;
    }

    public String showError(int errorCode) {
        return this.errorCodes[errorCode];
    }

    void printCardInfo() {
        System.out.println();
        System.out.println("Card number : " + this.cardNumber);
        System.out.println("Card balance : " + this.balance + "$");
        System.out.println("Card debt : " + this.creditDebt + "$");
        System.out.println("Credit limit : " + this.creditLimit + "$");
    }

    boolean checkPin(int pinCode) {
        boolean result = false;
        if (this.pinCode == pinCode) {
            result = true;
        }
        return result;
    }

    boolean checkCardNumber(int cardNumber) {
        boolean result = false;
        if (this.cardNumber == cardNumber) {
            result = true;
        }
        return result;
    }

    void depositMoney(int depositAmount) {
        if (checkPin(pinCode)) {
            if (this.creditDebt > 0) {
                if (this.creditDebt >= depositAmount) {
                    this.creditDebt = this.creditDebt - depositAmount;
                    depositAmount = 0;
                }
                else {
                    depositAmount = depositAmount - this.creditDebt;
                    this.creditDebt = 0;
                }
            }
            this.balance = this.balance + depositAmount;
        }
    }

    void withdrawMoney(int withdrawAmount) {
        if (checkPin(pinCode)) {
            if (withdrawAmount > (this.creditLimit + this.balance - this.creditDebt)) {
                System.out.println(showError(0));
            }
            else {
                if (withdrawAmount >= this.balance) {
                    this.creditDebt = this.creditDebt + ((this.balance - withdrawAmount) * (-1));
                    this.balance = 0;
                }
                else {
                    this.balance = this.balance - withdrawAmount;
                }
            }
        }
    }

}

class CreditCardTestAuto {
    protected CreditCard creditCard;
    protected CreditCardTest creditCardTest;
    protected int cardNumber;
    protected int cardPin;
    protected int balance;
    protected int creditLimit;
    protected int creditDebt;
    public static void main(String[] Args) {

        CreditCardTestAuto autoTest = new CreditCardTestAuto();

        System.out.println("\nCreating new card. \nCard Number: 8686\nCard Pin: 4444");
        autoTest.creditCard = new CreditCard(8686, 4444);
        autoTest.creditCard.printCardInfo();

        System.out.println("\nSetting credit limit to 500$...");
        autoTest.creditCard.setCreditLimit(500);
        autoTest.creditCard.printCardInfo();

        System.out.println("\nDepositing 350$...");
        autoTest.creditCard.depositMoney(350);
        autoTest.creditCard.printCardInfo();

        System.out.println("\nWithdrawing 400$...");
        autoTest.creditCard.withdrawMoney(400);
        autoTest.creditCard.printCardInfo();

        System.out.println("\nWithdrawing 450$...");
        autoTest.creditCard.withdrawMoney(450);
        autoTest.creditCard.printCardInfo();

        System.out.println("\nTrying to withdraw 1$...");
        autoTest.creditCard.withdrawMoney(1);
        autoTest.creditCard.printCardInfo();

        System.out.println("\nDepositing 550$...");
        autoTest.creditCard.depositMoney(550);
        autoTest.creditCard.printCardInfo();

        System.out.println("\nWithdrawing 100$...");
        autoTest.creditCard.withdrawMoney(100);
        autoTest.creditCard.printCardInfo();

        System.out.println("\nDepositing 45$...");
        autoTest.creditCard.depositMoney(45);
        autoTest.creditCard.printCardInfo();



    }
}

class CreditCardTest {
    protected CreditCard creditCard;
    protected int cardNumber;
    protected int cardPin;
    protected int balance;
    protected int creditLimit;
    protected int creditDebt;
    Scanner userInput = new Scanner(System.in);
    
    public static void main(String[] Args) {

        CreditCardTest cardTest = new CreditCardTest();
        cardTest.runTest();



    }

    private void runTest() {

        askNewCreditCardDetails();
        createNewCreditCard();
        //cardPin = 0;
        creditCard.printCardInfo();

        depositMoney();
        creditCard.printCardInfo();

        withdrawMoney();
        creditCard.printCardInfo();

        withdrawMoney();
        creditCard.printCardInfo();

        depositMoney();
        creditCard.printCardInfo();

    }


    boolean authenticateUser() {
        boolean result = false;
        System.out.println();
        System.out.print("Enter card number : ");
        int cardNumber = userInput.nextInt();
        System.out.print("Enter card pin : ");
        int pinCode = userInput.nextInt();

        if (creditCard.checkCardNumber(cardNumber) && creditCard.checkPin(pinCode)) {
            result = true;

        }
        return result;
    }

    void askNewCreditCardDetails() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter new card ID : ");
        this.cardNumber = userInput.nextInt();
        System.out.print("Enter new card pin : ");
        this.cardPin = userInput.nextInt();
    }

    void createNewCreditCard() {
        this.creditCard = new CreditCard(cardNumber, cardPin);
        cardPin = 0;
        this.creditCard.creditLimit = 500;
    }

    void depositMoney() {
        if (authenticateUser()) {
            System.out.print("Enter deposit amount : ");
            creditCard.depositMoney(userInput.nextInt());
        }
        else {
            System.out.println(creditCard.showError(1));
        }
    }

    void withdrawMoney() {
        if (authenticateUser()) {
            System.out.print("Enter withdraw amount : ");
            creditCard.withdrawMoney(userInput.nextInt());
        }
        else {
            System.out.println(creditCard.showError(1));
        }
    }


}
