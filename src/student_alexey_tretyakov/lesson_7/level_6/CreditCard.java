package student_alexey_tretyakov.lesson_7.level_6;

import java.math.BigDecimal;

class CreditCard {
    private String cardNumber;
    private int cardPin;
    private BigDecimal cardBalance ;
    private BigDecimal cardCreditLimit ;
    private BigDecimal cardCredit ;

    public CreditCard( String cardNumber, int cardPin) {
        this.cardNumber = cardNumber;
        this.cardPin = cardPin;
        this.cardBalance = BigDecimal.ZERO;
        this.cardCreditLimit = BigDecimal.ZERO;
        this.cardCredit = BigDecimal.ZERO ;
    }
    protected int getCardPin () { return this.cardPin; }

    protected BigDecimal getCardBalance() {
        return cardBalance;
    }

    protected void setCardCreditLimit(BigDecimal cardCreditLimit) {
        this.cardCreditLimit = cardCreditLimit;
    }
    protected String getCardNumber() {
        return this.cardNumber;
    }

    protected BigDecimal getCardCreditLimit() {
        return cardCreditLimit;
    }

    protected BigDecimal getCardCredit() {return cardCredit;}

    protected void depositCreditCard(int cardPin, BigDecimal sum) {
        if ( isCorrectCardPin( cardPin )) { addDepositCreditCard( sum );}
    }

    protected void withdrawCreditCard (int cardPin, BigDecimal sum) {
        if ( isCorrectCardPin( cardPin )) { withdrawDepositCreditCard( sum );}
    }
    private void withdrawDepositCreditCard( BigDecimal sum){

        if ( isAvailableCardBalance( sum ) ) {
            cardBalance= cardBalance.subtract( sum );
        } else {
            if (isAvailableCardCreditLimit(sum)) {
                cardCredit = cardCredit.add(sum);
                cardCredit = cardCredit.subtract(cardBalance);
                cardBalance = BigDecimal.ZERO;
            }
        }
    }
    private boolean isAvailableCardBalance( BigDecimal sum) {
        return cardBalance.compareTo(sum) >= 0;
    }
    private boolean isAvailableCardCreditLimit(BigDecimal sum) {

        BigDecimal sumCheck = new BigDecimal(0);
        sumCheck= sumCheck.add( cardBalance );
        sumCheck= sumCheck.add( cardCreditLimit );
        sumCheck= sumCheck.subtract( cardCredit );
        if ( sumCheck.compareTo( sum )  >= 0 ) {
            return true;
        } else {
            System.out.println(" Amount not available.");
            return false;
        }
    }

    private void addDepositCreditCard( BigDecimal sum){

        if ( isCardCreditZero() ) {
            cardBalance= cardBalance.add( sum );
        } else {
            if ( isAvailableCardCredit(sum) ){
                cardCredit = cardCredit.subtract( sum );
            } else {
                sum = sum.subtract( cardCredit );
                cardCredit = BigDecimal.ZERO;
                cardBalance = cardBalance.add ( sum );
            }
        }
    }

    private boolean isAvailableCardCredit(BigDecimal sum) {
        return cardCredit.compareTo(sum) >= 0;
    }

    private boolean isCardCreditZero(){
        return cardCredit.compareTo(BigDecimal.ZERO) == 0;
    }

    private boolean isCorrectCardPin( int cardPin ){
        if (  this.cardPin == cardPin ) {
            return true;
        } else {
            System.out.println(" Pin code error.");
            return false;
        }
    }

    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard ("1111222233334444",1234);

    }

}
