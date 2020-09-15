package student_jaroslav_brutan.lesson_9.day_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class FraudDetectorTest {

    public static void main(String[] args) {

        FraudDetectorTest test = new FraudDetectorTest();
        test.isPokemonThief();
        test.isMoreThan1000000();
        test.isThiefCity();
        test.isJamaicaTrader();
        test.isGermanyAndMoreThan1000();
    }

    void isPokemonThief(){

        Trader trader = new Trader("Pokemon", "Berlin", "Germany");
        if (trader.getFullName().equals("Pokemon")){
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }

    void isMoreThan1000000(){

        Trader trader = new Trader("Jarik","Riga", "Latvia");
        Transaction transaction = new Transaction(trader, 1000001);
        if (transaction.getAmount() > 1000000){
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }

    void isThiefCity(){

        Trader trader = new Trader("Pikachu", "Sydney", "Australia");
        if (trader.getCity().equals("Sydney")){
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FALSE");
        }
    }

    void isJamaicaTrader(){

        Trader trader = new Trader("Bob", "Cape Town", "Jamaica");
        if (trader.getCountry().equals("Jamaica")){
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }

    void isGermanyAndMoreThan1000(){

        Trader trader = new Trader("Mario","Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        if ((trader.getCountry().equals("Germany")) && transaction.getAmount() > 1000){
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }
}
