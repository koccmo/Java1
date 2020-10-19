package student_volodya_danilin.lesson_14.level_1;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FruitStorageTest {

    private FruitStorage storage = new FruitStorage();

    public static void main(String[] args) {
        FruitStorageTest test = new FruitStorageTest();
        test.greenApplesTest();
        test.applesByColorTest();

    }

    //Task_2
    void greenApplesTest() {
        List<Apple> allApplesTest = storage.getAllApples();
        List<Apple> greenApplesTest = storage.findGreenApples(allApplesTest);
        System.out.println("\nStarting findGreenApples test ... ");
        for (Apple value : greenApplesTest) {
            if (!"green".equals(value.getColor())) {
                System.out.println("Test FAIL");
            }
            else {
                System.out.println("Test OK, green apple found!");
            }
        }
        System.out.println("findGreenApples test is finished!");
    }

    //Task_4
    void applesByColorTest() {
        List<Apple> allApplesTest = storage.getAllApples();
        List<Apple> greenApplesTest = storage.findApplesByColor(allApplesTest, "green");
        List<Apple> redApplesTest = storage.findApplesByColor(allApplesTest, "red");
        System.out.println("\nStarting findApplesByColor test ... ");
        for (Apple value : greenApplesTest) {
            if (!"green".equals(value.getColor())) {
                System.out.println("Test FAIL!");
            }
            else {
                System.out.println("Test OK, found green apple!");
            }
        }
        for (Apple value : redApplesTest) {
            if (!"red".equals(value.getColor())) {
                System.out.println("Test FAIL!");
            }
            else {
                System.out.println("Test OK, found red apple!");
            }
        }
        System.out.println("findApplesByColor test is finished!");
    }
}
