package student_roberts_kupcs.lesson_9.level_4.Task_17;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();
        fraudDetectorTest.testIsPokemon();
        fraudDetectorTest.testIsMore1000000();
        fraudDetectorTest.testFromSidney();
        fraudDetectorTest.testTraderFromJamaica();

    }

    void testIsPokemon() {
        Trader pokemon = new Trader("Pokemon", "Riga");
        Transaction transaction = new Transaction(pokemon, 1000);

        if (pokemon.getFullName().equals("Pokemon")) {
            System.out.println("Test is Pokemon OK");
        } else {
            System.out.println("Test is Pokemon FAIL");
        }
    }

    void testIsMore1000000() {
        Trader roberts = new Trader("Roberts", "Riga");
        Transaction transaction = new Transaction(roberts, 1000001);

        if (transaction.getAmount() > 1000000) {
            System.out.println("Test is more 1000000 OK");
        } else {
            System.out.println("Test is more 1000000 FAIL");
        }
    }

    void testFromSidney() {
        Trader roberts = new Trader("Roberts", "Sidney");
        Transaction transaction = new Transaction(roberts, 1000001);

        if (roberts.getCity().equals("Sidney")) {
            System.out.println("Test from Sidney OK");
        } else {
            System.out.println("Test from Sidney is FAIL");
        }
    }

    void testTraderFromJamaica() {
        Trader roberts = new Trader("Jamaica");
        Transaction transaction = new Transaction(roberts, 1000);

        if (roberts.getCountry().equals("Jamaica")) {
            System.out.println("Test trader from Jamaica OK");
        } else {
            System.out.println("Test trader from Jamaica is FAIL");
        }
    }
}
