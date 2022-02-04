package roman.lesson_7.homework.day_6.task_11;


import java.math.BigDecimal;

public class CreditCard {

    private int cardNumber;
    private int cardPinCode;
    private BigDecimal balance = new BigDecimal("0.00");
    private BigDecimal creditLimit = new BigDecimal("500.00");
    private BigDecimal creditDept = new BigDecimal("0.00");

    public CreditCard(int cardNumber, int cardPinCode) {
        this.cardPinCode = cardPinCode;
        this.cardNumber = cardNumber;
    }

    public void setCreditLimit(BigDecimal newCreditLimit) { this.creditLimit = newCreditLimit; }
    public void setBalance(BigDecimal newBalance) { this.balance = newBalance; }
    public void setCreditDept(BigDecimal newCreditDept) { this.creditDept = newCreditDept; }


    public BigDecimal getBalance() { return balance; }
    public BigDecimal getCreditLimit() { return creditLimit; }
    public BigDecimal getCreditDept() { return creditDept; }

    public void deposit(int cardPinCode, BigDecimal depositValue) {
        if(checkCardPinCode(cardPinCode)) {
            if(depositValue.compareTo(getCreditDept()) <= 0) {
                setCreditDept(getCreditDept().subtract(depositValue));
            } else {
                setBalance(getBalance().add(depositValue).subtract(getCreditDept()));
                setCreditDept(new BigDecimal("0.00"));
            }
        }
    }

    public void withdraw(int cardPinCode, BigDecimal withdrawValue) {
        if(checkCardPinCode(cardPinCode) && noOverCreditLimitCheck(withdrawValue)) {
            if(getBalance().compareTo(withdrawValue) <= 0) {
                setCreditDept(getCreditDept().add(withdrawValue.subtract(getBalance())));
                setBalance(new BigDecimal("0.00"));
            } else setBalance(getBalance().subtract(withdrawValue));
        }
    }

    public boolean noOverCreditLimitCheck(BigDecimal withdrawValue) {
        return requiredCredit(withdrawValue).compareTo(getCreditLimit()) <= 0;
    }

    public BigDecimal requiredCredit(BigDecimal withdrawValue) {
        if(withdrawValue.compareTo(getBalance()) > 0) {
           return new BigDecimal(String.valueOf(getCreditDept().add(withdrawValue.subtract(getBalance()))));
        } else return BigDecimal.ZERO;
    }
    public boolean checkCardPinCode(int enterUserPinCode){
        return cardPinCode == enterUserPinCode;
    }

    public void printCardInfo() {
        System.out.println("Card Balance = " + balance);
        System.out.println("Card Credit Limit = " + creditLimit);
        System.out.println("Card Credit Dept = " + creditDept);
        System.out.println();
    }


}


/*
 public void deposit(int enterUserPinCode , BigDecimal depositingMoney) {
        if(checkCardPinCode(enterUserPinCode)) {
            depositAlgorithm(depositingMoney);
        } else System.out.println("Your Pin Code is Incorrect !!!");
    }

    public void withdraw (int enterUserPinCode , BigDecimal withdrawingMoney) {
        if(checkCardPinCode(enterUserPinCode)) {
            withdrawAlgorithm(withdrawingMoney);
        } else System.out.println("Your Pin Code is Incorrect !!!");
    }

    private void withdrawAlgorithm(BigDecimal withdrawMoney) {
        if(checkIfOverCreditLimit(withdrawMoney)) {
            System.out.println("Credit Limit is Over");
            System.out.println();
        } else {
            balance = balance.subtract(withdrawMoney);
            if(balance.compareTo(new BigDecimal("0.00")) < 0) {
            creditDept = creditDept.add(balance.abs());
                balance = new BigDecimal("0.00");
            }
        }
    }

    private boolean checkIfOverCreditLimit(BigDecimal withdrawMoney) {
        BigDecimal overLoanLimitCheck = new BigDecimal("0.00");
        if(balance.equals(overLoanLimitCheck)) {
            overLoanLimitCheck = creditDept.add(withdrawMoney);
        }
        return overLoanLimitCheck.compareTo(creditLimit) > 0;
    }

    private void depositAlgorithm(BigDecimal depositingMoney) {
        if(creditDept.compareTo(new BigDecimal("0.00")) == 0) {
            balance = balance.add(depositingMoney);
        }
        if(creditDept.compareTo(new BigDecimal("0.00")) > 0) {
            creditDept = creditDept.subtract(depositingMoney);
            if(creditDept.compareTo(new BigDecimal("0.00")) < 0) {
                balance = balance.add(creditDept.abs());
                creditDept = new BigDecimal("0.00");
            }
        }
    }

    private boolean checkCardPinCode(int enterUserPinCode){
        return cardPinCode == enterUserPinCode;
    }

    public void printCardInfo() {
        System.out.println("Card Balance = " + balance);
        System.out.println("Card Credit Limit = " + creditLimit);
        System.out.println("Card Credit Dept = " + creditDept);
        System.out.println();
    }

*/