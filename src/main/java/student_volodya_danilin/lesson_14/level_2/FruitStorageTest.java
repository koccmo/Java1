package student_volodya_danilin.lesson_14.level_2;

import java.util.List;
/*
Всё-таки следовало поменять тип return'а getWeight'a с String на int
 */
class FruitStorageTest {

    private FruitStorage storage = new FruitStorage();
    boolean isFailedTest = false;

    public static void main(String[] args) {
        FruitStorageTest test = new FruitStorageTest();

        //Task_10
        test.appleGreenColorPredicateTest();
        test.appleRedColorPredicateTest();
        test.appleHeavyWeightPredicateTest();
        test.appleLightWeightPredicateTest();

        //Task_11
        test.appleHeavyGreenPredicateTest();

        //Task_14
        test.anonymousRedAppleTest();
        test.anonymousGreenAppleTest();
        test.anonymousHeavyAppleTest();
        test.anonymousLightAppleTest();

        //Task_17
        test.lambdaRedAppleTest();
        test.lambdaGreenAppleTest();
        test.lambdaHeavyAppleTest();
        test.lambdaLightAppleTest();

        test.testConclusion();

    }

    //Task_10
    void appleGreenColorPredicateTest() {
        System.out.println("\nStarting green apple predicate test!");
        List<Apple> appleInventory = storage.getAllApples();
        List<Apple> foundApples = storage.findApples(appleInventory, new AppleGreenColorPredicate());
        for (Apple value : foundApples) {
            if (!"green".equals(value.getColor())) {
                System.out.println("Test FAIL!");
                isFailedTest = true;
            }
            else {
                System.out.println("Test OK, found green apple using predicate!");
            }
        }
        System.out.println("Finished green apple predicate test!");
    }

    //Task_10
    void appleRedColorPredicateTest() {
        System.out.println("\nStarting red apple predicate test!");
        List<Apple> appleInventory = storage.getAllApples();
        List<Apple> foundApples = storage.findApples(appleInventory, new AppleRedColorPredicate());
        for (Apple value : foundApples) {
            if (!"red".equals(value.getColor())) {
                System.out.println("Test FAIL!");
                isFailedTest = true;
            }
            else {
                System.out.println("Test OK, found red apple using predicate!");
            }
        }
        System.out.println("Finished red apple predicate test!");
    }

    //Task_10
    void appleHeavyWeightPredicateTest() {
        System.out.println("\nStarting heavyweight apple predicate test!");
        List<Apple> appleInventory = storage.getAllApples();
        List<Apple> foundApples = storage.findApples(appleInventory, new AppleHeavyWeightPredicate());
        for (Apple value : foundApples) {
            int foundWeight = Integer.parseInt(value.getWeight());
            if (!(foundWeight > 150)) {
                System.out.println("Test FAIL!");
                isFailedTest = true;
            }
            else {
                System.out.println("Test OK, found heavyweight apple using predicate!");
            }
        }
        System.out.println("Finished heavyweight apple predicate test!");
    }

    //Task_10
    void appleLightWeightPredicateTest() {
        System.out.println("\nStarting lightweight apple predicate test!");
        List<Apple> appleInventory = storage.getAllApples();
        List<Apple> foundApples = storage.findApples(appleInventory, new AppleLightWeightPredicate());
        for (Apple value : foundApples) {
            int foundWeight = Integer.parseInt(value.getWeight());
            if (!(foundWeight < 150)) {
                System.out.println("Test FAIL!");
                isFailedTest = true;
            }
            else {
                System.out.println("Test OK, found lightweight apple using predicate!");
            }
        }
        System.out.println("Finished lightweight apple predicate test!");
    }

    //Task_11
    void appleHeavyGreenPredicateTest() {
        System.out.println("\nStarting heavyweight+green apple predicate test!");
        List<Apple> appleInventory = storage.getAllApples();
        List<Apple> foundApples = storage.findApples(appleInventory, new AppleHeavyGreenPredicate());
        for (Apple value : foundApples) {
            int foundWeight = Integer.parseInt(value.getWeight());
            String foundColor = value.getColor();
            if (!(foundWeight > 150) || !foundColor.equals("green")) {
                System.out.println("Test FAIL!");
                isFailedTest = true;
            }
            else {
                System.out.println("Test OK, found heavyweight+green apple using predicate!");
            }
        }
        System.out.println("Finished heavyweight+green apple predicate test!");
    }

    //Task_14
    void anonymousRedAppleTest() {
        System.out.println("\nStarting anonymous class red apple search test!");
        List<Apple> appleInventory = storage.getAllApples();
        List<Apple> foundApples = storage.findApples(appleInventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "red".equals(apple.getColor());
            }
        });
        for (Apple value : foundApples) {
            if (!"red".equals(value.getColor())) {
                System.out.println("Test FAIL!");
                isFailedTest = true;
            }
            else {
                System.out.println("Test OK, found red apple using anonymous class!");
            }
        }
        System.out.println("Anonymous class red apple search test is finished!");
    }

    //Task_14
    void anonymousGreenAppleTest() {
        System.out.println("\nStarting anonymous class green apple search test!");
        List<Apple> appleInventory = storage.getAllApples();
        List<Apple> foundApples = storage.findApples(appleInventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "green".equals(apple.getColor());
            }
        });
        for (Apple value : foundApples) {
            if (!"green".equals(value.getColor())) {
                System.out.println("Test FAIL!");
                isFailedTest = true;
            }
            else {
                System.out.println("Test OK, found green apple using anonymous class!");
            }
        }
        System.out.println("Anonymous class green apple search test is finished!");
    }

    //Task_14
    void anonymousHeavyAppleTest() {
        System.out.println("\nStarting anonymous class heavyweight apple search test!");
        List<Apple> appleInventory = storage.getAllApples();
        List<Apple> foundApples = storage.findApples(appleInventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                int appleWeight = Integer.parseInt(apple.getWeight());
                return appleWeight > 150;
            }
        });
        for (Apple value : foundApples) {
            int foundWeight = Integer.parseInt(value.getWeight());
            if (!(foundWeight > 150)) {
                System.out.println("Test FAIL!");
                isFailedTest = true;
            }
            else {
                System.out.println("Test OK, found heavyweight apple using anonymous class!");
            }
        }
        System.out.println("Anonymous class heavyweight apple search test is finished!");
    }

    //Task_14
    void anonymousLightAppleTest() {
        System.out.println("\nStarting anonymous class lightweight apple search test!");
        List<Apple> appleInventory = storage.getAllApples();
        List<Apple> foundApples = storage.findApples(appleInventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                int appleWeight = Integer.parseInt(apple.getWeight());
                return appleWeight < 150;
            }
        });
        for (Apple value : foundApples) {
            int foundWeight = Integer.parseInt(value.getWeight());
            if (!(foundWeight < 150)) {
                System.out.println("Test FAIL!");
                isFailedTest = true;
            }
            else {
                System.out.println("Test OK, found lightweight apple using anonymous class!");
            }
        }
        System.out.println("Anonymous class lightweight apple search test is finished!");
    }

    //Task_17
    void lambdaRedAppleTest() {
        System.out.println("\nStarting red apple lambda test!");
        List<Apple> appleInventory = storage.getAllApples();
        List<Apple> redApples = storage.findApples(appleInventory,
                (Apple apple) -> "red".equals(apple.getColor()));
        for (Apple value : redApples) {
            if (!"red".equals(value.getColor())) {
                System.out.println("Test FAIL!");
                isFailedTest = true;
            }
            else {
                System.out.println("Test OK, found red apple using lambda!");
            }
        }
        System.out.println("Red apple lambda test is finished!");
    }

    //Task_17
    void lambdaGreenAppleTest() {
        System.out.println("\nStarting green apple lambda test!");
        List<Apple> appleInventory = storage.getAllApples();
        List<Apple> greenApples = storage.findApples(appleInventory,
                (Apple apple) -> "green".equals(apple.getColor()));
        for (Apple value : greenApples) {
            if (!"green".equals(value.getColor())) {
                System.out.println("Test FAIL!");
                isFailedTest = true;
            }
            else {
                System.out.println("Test OK, found green apple using lambda!");
            }
        }
        System.out.println("Green apple lambda test is finished!");
    }

    //Task_17
    void lambdaHeavyAppleTest() {
        System.out.println("\nStarting heavyweight apple lambda test!");
        List<Apple> appleInventory = storage.getAllApples();
        List<Apple> heavyApples = storage.findApples(appleInventory,
                (Apple apple) -> {
            int appleWeight = Integer.parseInt(apple.getWeight());
            return appleWeight > 150;
                });
        for (Apple value : heavyApples) {
            int foundWeight = Integer.parseInt(value.getWeight());
            if (!(foundWeight > 150)) {
                System.out.println("Test FAIL!");
                isFailedTest = true;
            }
            else {
                System.out.println("Test OK, found heavyweight apple using lambda!");
            }
        }
        System.out.println("Heavyweight apple lambda test is finished!");
    }

    //Task_17
    void lambdaLightAppleTest() {
        System.out.println("\nStarting lightweight apple lambda test!");
        List<Apple> appleInventory = storage.getAllApples();
        List<Apple> lightApples = storage.findApples(appleInventory,
                (Apple apple) -> {
                    int appleWeight = Integer.parseInt(apple.getWeight());
                    return appleWeight < 150;
                });
        for (Apple value : lightApples) {
            int foundWeight = Integer.parseInt(value.getWeight());
            if (!(foundWeight < 150)) {
                System.out.println("Test FAIL!");
                isFailedTest = true;
            }
            else {
                System.out.println("Test OK, found lightweight apple using lambda!");
            }
        }
        System.out.println("Lightweight apple lambda test is finished!");
    }

    void testConclusion() {
        if (isFailedTest) {
            System.out.println("\nSome tests failed!");
        }
        else {
            System.out.println("\nAll tests passed!");
        }
    }
}
