package student_aleksandra_maksimovic.lesson_9.level_4.task_17_21;


public class FraudDetectorTest {

    FraudDetector fraudDetector = new FraudDetector();

    public static void main(String[] args) {

        FraudDetectorTest detector = new FraudDetectorTest();
        detector.testIsPokemon();
        detector.testIsNotPokemon();
        detector.testIsTransactionExceedsLimit();
        detector.testIsTransactionNotExceedsLimit();
        detector.testIsSydney();
        detector.testIsJamaica();
        detector.testIsGermanAndMoreThen1000();
        detector.testIsGermanAndLessThen1000();
        detector.testIsGermanAndExceedsLimit();
        detector.testIsPokemonAndExceedsLimit();
    }

    void checkResult(String name,  boolean testResult){
        if (testResult){
            System.out.println(name + " test = OK");
        }else{
            System.out.println(name+" test = FAIL");
        }
    }

    void testIsPokemon(){
        Trader pokemon = new Trader("Pokemon", "New York", "USA");
        Transaction transaction = new Transaction(pokemon, 200);

        checkResult("testIsPokemon", fraudDetector.isFraud(transaction));
    }

    void testIsNotPokemon(){
        Trader  notPokemon = new Trader("Vasja", "Riga", "Latvia");
        Transaction transaction = new Transaction(notPokemon, 700);

        checkResult("testIsNotPokemon", !fraudDetector.isFraud(transaction));
    }

    void testIsTransactionExceedsLimit(){
         Trader anna = new Trader("Anna", "La Coruna", "Spain");
         Transaction transaction = new Transaction(anna, 1000001);

         checkResult("testIsTransactionExceedsLimit", fraudDetector.isFraud(transaction));
    }

    void testIsTransactionNotExceedsLimit(){
        Trader anna = new Trader("Anna", "La Coruna", "Spain");
        Transaction transaction = new Transaction(anna, 999999);

        checkResult("testIsTransactionNotExceedsLimit",!fraudDetector.isFraud(transaction));
    }

    void testIsSydney(){
        Trader bill = new Trader("Bill", "Sydney", "Australia");
        Transaction transaction = new Transaction(bill, 100);

        checkResult("testIsSydney", fraudDetector.isFraud(transaction));
    }

    void testIsJamaica(){
        Trader johan = new Trader("Johan", "nouIdea", "Jamaica");
        Transaction transaction = new Transaction(johan, 14000);

        checkResult("testIsJamaica", fraudDetector.isFraud(transaction));
    }

    void testIsGermanAndMoreThen1000(){
        Trader gans = new Trader("Gans", "Berlin","German");
        Transaction transaction = new Transaction(gans, 1010 );

        checkResult("testIsGermanAndMoreThen1000", fraudDetector.isFraud(transaction));
    }

    void testIsGermanAndLessThen1000(){
        Trader gans = new Trader("Gans", "Berlin", "German");
        Transaction transaction = new Transaction(gans, 999);

        checkResult("testIsGermanAndLessThen1000", !fraudDetector.isFraud(transaction));
    }

    void testIsGermanAndExceedsLimit(){
        Trader gans = new Trader("Gans", "Berlin", "German");
        Transaction transaction = new Transaction(gans, 2000000);

        checkResult("testIsGermanAndExceedsLimit", fraudDetector.isFraud(transaction) );
    }
    void testIsPokemonAndExceedsLimit(){
        Trader pokemon = new Trader("Pokemon", "New York", "USA");
        Transaction transaction = new Transaction(pokemon, 2000600000);

        checkResult("testIsPokemonAndExceedsLimit", fraudDetector.isFraud(transaction));
    }
}