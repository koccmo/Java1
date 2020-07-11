package student_jekaterina_loseva.lesson_4.level_6;

public class StockTest {

    public static void main(String[] args) {
        StockTest test = new StockTest();
        test.test1();
        test.test2();
    }

    public void test1() {
        Stock test1 = new Stock("moon", 12);
        if (test1.getCurrentPrice() == 12 && test1.getMinPrice() == 12 && test1.getMaxPrice() == 12) {
            System.out.println("Test 1 is = OK");
        } else {
            System.out.println("Test 1 is = FAIL");
        }
    }

    public void test2() {
        Stock test2 = new Stock("moon", 12);
        test2.updatePrice(15);
        test2.updatePrice(7);
        test2.updatePrice(14);
        if (test2.getCurrentPrice() == 14 && test2.getMinPrice() == 7 && test2.getMaxPrice() == 15) {
            System.out.println("Test 2 is = OK");
        } else {
            System.out.println("Test 2 is = FAIL");
        }
    }

}
