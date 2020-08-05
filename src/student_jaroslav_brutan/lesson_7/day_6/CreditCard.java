package student_jaroslav_brutan.lesson_7.day_6;

public class CreditCard {

    private double cardNumber;
    private int pinCode;
    private double cardBalance;
    private int creditLimit;
    private double creditLiability;
    private double moneyAmount;

    public CreditCard(double cardNumber, int pinCode){
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        cardBalance = 0.00;
        creditLiability = 0.00;
        creditLimit = 500;
    }

    public double getCardNumber() {
        return cardNumber;
    }

    public int getPinCode() {
        return pinCode;
    }

    public double withdraw(int pinCode, double moneyAmount){
        if (pinCode == getPinCode()){
            cardBalance = cardBalance - moneyAmount;
        } else if ((cardBalance <= 0) && (creditLiability > creditLimit)){
            cardBalance = creditLimit - moneyAmount;
        } else {
            System.out.println("Withdraw can't be done.");
        } return cardBalance;
    }

    public double deposit(int pinCode, double moneyAmount){
        if (pinCode == getPinCode()){
            creditLiability = creditLiability + moneyAmount;
        } else if (creditLiability == 0){
            cardBalance = cardBalance + moneyAmount;
        } return cardBalance;
    }
}
