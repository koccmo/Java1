package student_igors_bartkevics.lesson_9.homework.level_4.task_17_18_19_20;

public class FraudDetectorTest {

    FraudDetector detector = new FraudDetector();

    public static void main(String[] args) {
        FraudDetectorTest test = new FraudDetectorTest();
        test.isNotPokemonTest();
        test.pokemonTest();
        test.transactionAmountExceedsLimitTest();
        test.transactionAmountDoesNotExceedLimitTest();
        test.transactionAmountIsEqualToLimitTest();
        test.traderIsFromSidney();
        test.traderIsNotFromSidney();
        test.traderIsFromJamaica();
        test.traderIsNotFromJamaica();

    }

    void isNotPokemonTest() {
        boolean condition = !detector.isPokemon(new Trader("Igors", "Riga", "Latvia"));
        checkResult(condition, "Trader is not Pokemon");
    }

    void pokemonTest() {
        boolean condition = detector.isPokemon(new Trader("Pokemon", "Tokyo", "Japan"));
        checkResult(condition, "Trader is Pokemon");
    }

    void transactionAmountExceedsLimitTest() {
        boolean condition = detector.isTransactionAmountExceedingLimit(1000001);
        checkResult(condition, "Transaction amount exceeds limit");
    }

    void transactionAmountDoesNotExceedLimitTest() {
        boolean condition = !detector.isTransactionAmountExceedingLimit(100000);
        checkResult(condition, "Transaction amount does not exceed limit");
    }

    void transactionAmountIsEqualToLimitTest() {
        boolean condition = !detector.isTransactionAmountExceedingLimit(1000000);
        checkResult(condition, "Transaction amount is equal to limit");
    }

    void traderIsFromSidney() {
        boolean condition = detector.isTraderFromSidney(new Trader("John Smith", "Sidney", "Australia"));
        checkResult(condition, "Trader is from Sidney");
    }

    void traderIsNotFromSidney() {
        boolean condition = !detector.isTraderFromSidney(new Trader("John Smith", "Chicago", "USA"));
        checkResult(condition, "Trader is NOT from Sidney");
    }

    void traderIsFromJamaica() {
        boolean condition = detector.isTraderFromJamaica(new Trader("Bob Marley", "Kingston", "Jamaica"));
        checkResult(condition, "Trader is from Jamaica");
    }

    void traderIsNotFromJamaica() {
        boolean condition = !detector.isTraderFromJamaica(new Trader("John Smith", "Chicago", "USA"));
        checkResult(condition, "Trader is NOT from Jamaica");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }



}
