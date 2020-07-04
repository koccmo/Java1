package student_aleksandra_maksimovic.lesson_4.level_6;

import student_aleksandra_maksimovic.testing.Tester;
/*
10 -> 12 -> 5 -> 7 -> 99 -> 77

Test case max:

999  = 999

999 -> 1  = 999

999 -> 2 -> 1000 = 1000

999 -> 2 -> 1000 -> 8 = 1000
 */
public class StockDemoTest {
    public static void main(String[] args) {
        Tester tester = new Tester();

        Stock stock1 = new Stock("stock1", 10);

        tester.check(stock1.getCurrentPrice() == 10, "constructor current price test");
        tester.check(stock1.getMinPrice() == 10, "constructor min price test");
        tester.check(stock1.getMaxPrice() == 10, "constructor max price test");

        stock1.updatePrice(12);
        tester.check(stock1.getCurrentPrice() == 12, "stock1 test #1 cur");
        tester.check(stock1.getMinPrice() == 10, "stock1 test #1 min");
        tester.check(stock1.getMaxPrice() == 12, "stock1 test #1 max");

        stock1.updatePrice(5);
        tester.check(stock1.getCurrentPrice() == 5, "stock1 test #2 cur");
        tester.check(stock1.getMinPrice() == 5, "stock1 test #2 min");
        tester.check(stock1.getMaxPrice() == 12, "stock1 test #2 max");

        stock1.updatePrice(7);
        tester.check(stock1.getCurrentPrice() == 7, "stock1 test #3 cur");
        tester.check(stock1.getMinPrice() == 5, "stock1 test #3 min");
        tester.check(stock1.getMaxPrice() == 12, "stock1 test #3 max");

        stock1.updatePrice(99);
        tester.check(stock1.getCurrentPrice() == 99, "stock1 test #4 cur");
        tester.check(stock1.getMinPrice() == 5, "stock1 test #4 min");
        tester.check(stock1.getMaxPrice() == 99, "stock1 test #4 max");

        stock1.updatePrice(77);
        tester.check(stock1.getCurrentPrice() == 77, "stock1 test #5 cur");
        tester.check(stock1.getMinPrice() == 5, "stock1 test #5 min");
        tester.check(stock1.getMaxPrice() == 99, "stock1 test #5 max");



        Stock stockMax = new Stock("Max", 999);
        tester.check(stockMax.getMaxPrice() == 999, "stockMax test #1 max");

        stockMax.updatePrice(1);
        tester.check(stockMax.getMaxPrice() == 999, "stockMax test #2 max");

        stockMax.updatePrice(1000);
        tester.check(stockMax.getMaxPrice() == 1000, "stockMax test #3 max");

        stockMax.updatePrice(8);
        tester.check(stockMax.getMaxPrice() == 1000, "stockMax test #4 max");
    }
}
