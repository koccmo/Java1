package student_valerija_ionova.lesson_9.level_4.task_17;

class FraudDetectorTest {

    public static void main (String [] args){
        FraudDetectorTest test = new FraudDetectorTest();

        test.testIsPokemon();
        test.testIsNotPokemon();
        test.testIsTooBigAmount();
        test.testIsSydney();
        test.testIsSydneyAndBigAmount();
        test.testIsJamaica();
        test.testIsGermanAnd1000();
        test.testIsGermanAndLessThan1000();

    }

    void checkResult(String name,  boolean testResult){
        if (testResult){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    void testIsPokemon(){
        Trader pokemon = new Trader("Pokemon", "New York");
        Transaction transaction = new Transaction(pokemon, 200);

        FraudDetector fraudDetector = new FraudDetector();

        checkResult("testIsPokemon", fraudDetector.isFraud(transaction) == true);
    }

    void testIsNotPokemon(){
        Trader smith = new Trader("Smith", "California");
        Transaction transaction = new Transaction(smith, 500);

        FraudDetector fraudDetector = new FraudDetector();

        checkResult("testIsPokemon", fraudDetector.isFraud(transaction) == false);
    }

    void testIsTooBigAmount(){
        Trader smith = new Trader("Smith", "California");
        Transaction transaction = new Transaction(smith, 1000005);

        FraudDetector fraudDetector = new FraudDetector();

        checkResult("testIsTooBigAmount", fraudDetector.isFraud(transaction) == true);
    }

    void testIsSydney(){
        Trader smith = new Trader("Smith", "Sydney");
        Transaction transaction = new Transaction(smith, 10005);

        FraudDetector fraudDetector = new FraudDetector();

        checkResult("testIsSydney", fraudDetector.isFraud(transaction) == true);
    }

    void testIsSydneyAndBigAmount(){
        Trader smith = new Trader("Smith", "Sydney");
        Transaction transaction = new Transaction(smith, 1000005);

        FraudDetector fraudDetector = new FraudDetector();

        checkResult("testIsSydneyAndBigAmount", fraudDetector.isFraud(transaction) == true);
    }

    void testIsJamaica(){
        Trader smith = new Trader("Smith", "Jamaica");
        Transaction transaction = new Transaction(smith, 10005);

        FraudDetector fraudDetector = new FraudDetector();

        checkResult("testIsJamaica", fraudDetector.isFraud(transaction) == true);
    }

    void testIsGermanAnd1000(){
        Trader smith = new Trader("Smith", "German");
        Transaction transaction = new Transaction(smith, 10005);

        FraudDetector fraudDetector = new FraudDetector();

        checkResult("testIsGermanAnd1000", fraudDetector.isFraud(transaction) == true);
    }

    void testIsGermanAndLessThan1000(){
        Trader smith = new Trader("Smith", "German");
        Transaction transaction = new Transaction(smith, 105);

        FraudDetector fraudDetector = new FraudDetector();

        checkResult("testIsGermanAndLessThan1000", fraudDetector.isFraud(transaction) == false);
    }



}
