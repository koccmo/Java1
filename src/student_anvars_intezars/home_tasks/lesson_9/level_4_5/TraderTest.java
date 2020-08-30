package student_anvars_intezars.home_tasks.lesson_9.level_4_5;

class TraderTest {

    public static void main(String[] args) {

        TraderTest traderTest = new TraderTest();
        traderTest.firstTestForFraud();
        traderTest.secondTestForFraud();
        traderTest.thirdTestForFraud();
        traderTest.fourthTestForFraud();
        traderTest.fifthTestForFraud();
        traderTest.rule1TestForFraud();
        traderTest.rule2TestForFraud();
        traderTest.rule3TestForFraud();
        traderTest.rule4TestForFraud();
        traderTest.rule5TestForFraud();
    }

    void firstTestForFraud() {
        Trader firstTrader = new Trader("Pokemon","Riga","Latvia");
        Transaction firstTransaction = new Transaction(firstTrader,1000);
        int amountOfFirstTransaction = firstTransaction.getAmount();
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(firstTrader,amountOfFirstTransaction);
        if (result) {
            System.out.println("Test for detecting fraud by name = OK");
        } else {
            System.out.println("Test for detecting fraud by name = FAIL");
        }
    }

    void secondTestForFraud() {
        Trader secondTrader = new Trader("Digimon","Riga","Latvia");
        Transaction secondTransaction = new Transaction(secondTrader,1000001);
        int amountOfSecondTransaction = secondTransaction.getAmount();
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(secondTrader,amountOfSecondTransaction);
        if (result) {
            System.out.println("Test for detecting fraud by amount = OK");
        } else {
            System.out.println("Test for detecting fraud by amount = FAIL");
        }
    }

    void thirdTestForFraud() {
        Trader thirdTrader = new Trader("Andrey","Sidney","USA");
        Transaction thirdTransaction = new Transaction(thirdTrader,2000);
        int amountOfThirdTransaction = thirdTransaction.getAmount();
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(thirdTrader,amountOfThirdTransaction);
        if (result) {
            System.out.println("Test for detecting fraud by city = OK");
        } else {
            System.out.println("Test for detecting fraud by city = FAIL");
        }
    }

    void fourthTestForFraud () {
        Trader fourthTrader = new Trader("Vasily","Krasnodar","Jamaica");
        Transaction fourthTransaction = new Transaction(fourthTrader,4500);
        int amountOfFourthTransaction = fourthTransaction.getAmount();
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(fourthTrader,amountOfFourthTransaction);
        if(result) {
            System.out.println("Test for detecting fraud by country = OK");
        } else {
            System.out.println("Test for detecting fraud by country = FAIL");
        }
    }

    void fifthTestForFraud() {
        Trader fifthTrader = new Trader("Sasha","Moscow","Germany");
        Transaction fifthTransaction = new Transaction(fifthTrader,1001);
        int amountOfFifthTransaction = fifthTransaction.getAmount();
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(fifthTrader,amountOfFifthTransaction);
        if (result) {
            System.out.println("Test for detecting fraud by country and amount = OK");
        } else {
            System.out.println("Test for detecting fraud by country and amount = FAIL");
        }
    }

    void rule1TestForFraud() {
        Trader sixthTrader = new Trader("Pokemon","Sochi","Russia Federation");
        FraudRule1 fraudRule1 = new FraudRule1("Find Pokemon");
        boolean result = fraudRule1.isFraud(sixthTrader,1000);
        if (result) {
            System.out.println("Test for Rule1 = OK");
        } else {
            System.out.println("Test for Rule = FAIL");
        }
    }

    void rule2TestForFraud() {
        Trader seventhTrader = new Trader("Petja","Riga","Latvia");
        FraudRule2 fraudRule2 = new FraudRule2("Find amount > 1000000");
        boolean result = fraudRule2.isFraud(seventhTrader,1000001);
        if (result) {
            System.out.println("Test for Rule2 = OK");
        } else {
            System.out.println("Test for RUle2 = FAIL");
        }
    }

    void rule3TestForFraud() {
        Trader eighthTrader = new Trader("Sunny","Sidney","Canada");
        FraudRule3 fraudRule3 = new FraudRule3("Find fraud by city");
        boolean result = fraudRule3.isFraud(eighthTrader,1000);
        if (result) {
            System.out.println("Test for Rule3 = OK");
        } else {
            System.out.println("Test for Rule3 = FAIL");
        }
    }

    void rule4TestForFraud(){
        Trader ninthTrader = new Trader("Afanasij","Riga","Jamaica");
        FraudRule4 fraudRule4 = new FraudRule4("Find fraud by country");
        boolean result = fraudRule4.isFraud(ninthTrader,57575);
        if (result) {
            System.out.println("Test for Rule4 = OK");
        } else {
            System.out.println("Test for RUle4 = FAIL");
        }
    }

    void rule5TestForFraud() {
        Trader tenthTrader = new Trader("Anton","Berlin","Germany");
        FraudRule5 fraudRule5 = new FraudRule5("Find fraud by country and amount");
        boolean result = fraudRule5.isFraud(tenthTrader,1001);
        if (result) {
            System.out.println("Test for Rule5 = OK");
        } else {
            System.out.println("Test for Rule5 = FAIL");
        }
    }
}