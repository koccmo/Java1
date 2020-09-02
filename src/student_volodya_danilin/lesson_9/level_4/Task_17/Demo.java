package student_volodya_danilin.lesson_9.level_4.Task_17;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Demo {

    public static void main(String[] Args) {

        System.out.println("Starting new test ...");
        FraudDetector fd = new FraudDetector();

        System.out.println("Test 1 \nTesting Pokemon");
        Trader trader1 = new Trader("Pokemon");
        Transaction t1 = new Transaction(trader1);
        if (fd.nameIsPokemon(t1)) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("fd.nameIsPokemon FAIL");
        }

        System.out.println("\nTest 2 \nTesting money amount too big");
        Trader trader2 = new Trader("Trader1");
        Transaction t2 = new Transaction(trader2);
        t2.prepareDeposit(trader2, 1000001);
        if (fd.amountTooBig(t2)) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("fd.amountTooBig FAIL");
        }

        System.out.println("\nTest 3 \nTesting trader from city Sydney");
        Trader trader3 = new Trader("Nguyen", "Sydney");
        Transaction t3 = new Transaction(trader3);
        if (fd.cityIsSydney(t3)) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("fd.cityIsSydney FAIL");
        }

        System.out.println("\nTest 4 \nTesting trader from country Jamaica");
        Trader trader4 = new Trader("Jah", "Kingston", "Jamaica");
        Transaction t4 = new Transaction(trader4);
        if (fd.countryIsJamaica(t4)) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("fd.cityIsSydney FAIL");
        }

        System.out.println("\nTest 5 \nTesting German money limit");
        Trader trader5 = new Trader("Klaus", "Koln", "Germany");
        Transaction t5 = new Transaction(trader5);
        t5.prepareDeposit(trader5, 10001);
        if (fd.germanOverLimit(t5)) {
            System.out.println("Test OK");
        }
        else {
            System.out.println("fd.germanOverLimit FAIL");
        }
    }
}
