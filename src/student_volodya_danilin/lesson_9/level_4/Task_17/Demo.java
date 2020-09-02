package student_volodya_danilin.lesson_9.level_4.Task_17;

import java.util.List;

public class Demo {

    public static void main(String[] Args) {

        System.out.println("Starting new tests ...");

        FraudRule[] fraudRules = new FraudRule[] {
            new FraudRule1("Name is Pokemon"),
            new FraudRule2("Amount too big"),
            new FraudRule3("City Sydney banned"),
            new FraudRule4("Country Jamaica banned"),
            new FraudRule5("German over limit"),
        };


        FraudDetector fd = new FraudDetector(fraudRules);

        System.out.println("\nTesting rule 1, Trader name Pokemon");
        Trader trader1 = new Trader("Pokemon");
        Transaction tr1 = new Transaction(trader1, 100);
        System.out.println("Should be denied ...");
        if (fd.isFraud(tr1)) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIL");
        }

        System.out.println("\nTesting rule 1, Trader name not Pokemon");
        System.out.println("Should be allowed ...");
        Trader trader1a = new Trader("not Pokemon");
        Transaction tr1a = new Transaction(trader1a, 100);
        if (!fd.isFraud(tr1a)) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIL");
        }

        System.out.println("\nTesting rule 2, transaction amount 1 000 000 + 1");
        System.out.println("Should be denied ...");
        Trader trader2 = new Trader("TestName");
        Transaction tr2 = new Transaction(trader2, 1000001);
        if (fd.isFraud(tr2)) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIL");
        }

        System.out.println("\nTesting rule 2, transaction amount 1 000 000");
        System.out.println("Should be allowed ...");
        Trader trader2a = new Trader("TestName");
        Transaction tr2a = new Transaction(trader2a, 1000000);
        if (!fd.isFraud(tr2a)) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIL");
        }

        System.out.println("\nTesting rule 3, trader from banned city Sydney");
        System.out.println("Should be denied ...");
        Trader trader3 = new Trader("TestName", "Sydney");
        Transaction tr3 = new Transaction(trader3, 100);
        if (fd.isFraud(tr3)) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIL");
        }
        System.out.println("\nTesting rule 3, trader from not banned city ");
        System.out.println("Should be allowed ...");
        Trader trader3a = new Trader("TestName", "not banned city");
        Transaction tr3a = new Transaction(trader3a, 100);
        if (!fd.isFraud(tr3a)) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIL");
        }

        System.out.println("\nTesting rule 4, trader from banned country Jamaica");
        System.out.println("Should be denied ...");
        Trader trader4 = new Trader("Jah", "Kingston", "Jamaica");
        Transaction tr4 = new Transaction(trader4, 100);
        if (fd.isFraud(tr4)) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIl");
        }
        System.out.println("\nTesting rule 4, trader from not banned country");
        System.out.println("Should be allowed ...");
        Trader trader4a = new Trader("Jah", "Moscow", "not banned");
        Transaction tr4a = new Transaction(trader4a, 100);
        if (!fd.isFraud(tr4a)) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIL");
        }

        System.out.println("\nTesting rule 5, german limit 1000 + 1");
        System.out.println("Should be denied ...");
        Trader trader5 = new Trader("Name", "Koln", "Germany");
        Transaction tr5 = new Transaction(trader5, 1001);
        if (fd.isFraud(tr5)) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIL");
        }
        System.out.println("\nTesting rule 5, german limit 1000");
        System.out.println("Should be allowed ...");
        Trader trader5a = new Trader("Name", "Koln", "Germany");
        Transaction tr5a = new Transaction(trader5a, 1000);
        if (!fd.isFraud(tr5a)) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("Test FAIL");
        }
    }
}
