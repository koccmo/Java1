package student_volodya_danilin.lesson_9.level_4_5;


public class Demo {

    public static void main(String[] Args) {

        System.out.println("Starting new tests ...\n");
        FraudRule[] fraudRules = new FraudRule[]{
                new FraudRule1("Rule 1 : Name Pokemon is banned"),
                new FraudRule2("Rule 2 : Amount too big (>1 000 000)"),
                new FraudRule3("Rule 3 : City Sydney is banned"),
                new FraudRule4("Rule 4 : Country Jamaica is banned"),
                new FraudRule5("Rule 5 : German over limit (>1000)"),
        };

        FraudDetector fd = new FraudDetector(fraudRules);
        FraudDetectionResult fdResult;

        System.out.print("Test 1 - Should be denied ... ");
        Trader trader1 = new Trader("Pokemon");
        Transaction t1 = new Transaction(trader1, 100);
        fdResult = fd.isFraud(t1);
        fdResult.printResultFDR(t1);

        System.out.print("Test 1a - Should be allowed ... ");
        Trader trader1a = new Trader("Not Pokemon");
        Transaction t1a = new Transaction(trader1a, 100);
        fdResult = fd.isFraud(t1a);
        fdResult.printResultFDR(t1a);

        System.out.print("Test 2 - Should be denied ... ");
        Trader trader2 = new Trader("Name");
        Transaction t2 = new Transaction(trader2, 1000001);
        fdResult = fd.isFraud(t2);
        fdResult.printResultFDR(t2);

        System.out.print("Test 2a - Should be allowed ... ");
        Trader trader2a = new Trader("Name");
        Transaction t2a = new Transaction(trader2a, 1000000);
        fdResult = fd.isFraud(t2a);
        fdResult.printResultFDR(t2a);

        System.out.print("Test 3 - Should be denied ... ");
        Trader trader3 = new Trader("Name", "Sydney");
        Transaction t3 = new Transaction(trader3, 100);
        fdResult = fd.isFraud(t3);
        fdResult.printResultFDR(t3);

        System.out.print("Test 3a - Should be allowed ... ");
        Trader trader3a = new Trader("Name", "Not Sydney");
        Transaction t3a = new Transaction(trader3a, 100);
        fdResult = fd.isFraud(t3a);
        fdResult.printResultFDR(t3a);

        System.out.print("Test 4 - Should be denied ... ");
        Trader trader4 = new Trader("Name", "City", "Jamaica");
        Transaction t4 = new Transaction(trader4, 100);
        fdResult = fd.isFraud(t4);
        fdResult.printResultFDR(t4);

        System.out.print("Test 4a - Should be allowed ... ");
        Trader trader4a = new Trader("Name", "City", "Not Jamaica");
        Transaction t4a = new Transaction(trader4a, 100);
        fdResult = fd.isFraud(t4a);
        fdResult.printResultFDR(t4a);

        System.out.print("Test 5 - Should be denied ... ");
        Trader trader5 = new Trader("Name", "City", "Germany");
        Transaction t5 = new Transaction(trader5, 1001);
        fdResult = fd.isFraud(t5);
        fdResult.printResultFDR(t5);

        System.out.print("Test 5a - Should be allowed ... ");
        Trader trader5a = new Trader("Name", "City", "Germany");
        Transaction t5a = new Transaction(trader5a, 1000);
        fdResult = fd.isFraud(t5a);
        fdResult.printResultFDR(t5a);

        System.out.println("Breaking several rules ...\n");

        System.out.print("Test X - Should be denied ... ");
        Trader traderX = new Trader("Pokemon", "Sydney", "Germany");
        Transaction tX = new Transaction(traderX, 1000000000);
        fdResult = fd.isFraud(tX);
        fdResult.printResultFDR(tX);
    }
}
