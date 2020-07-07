package student_alexey_tretyakov.lesson_4.level_6;

public class StockTest {

   public void testPrice ( String price, double stockPrice, double testPrice ) {

        if ( stockPrice == testPrice) {
            System.out.println("Set " + price + " price test = OK.");
        } else {
            System.out.println("Set " + price + " price test = FAIL.");
        }
   }

    public static void main(String[] args) {
        Stock testCompany = new Stock("RRRR", 10);
        StockTest stockTest = new StockTest();

        testCompany.updatePrice(12);
        stockTest.testPrice ("current",testCompany.getCurrentPrice(),12);
        stockTest.testPrice ("Min",testCompany.getMinPrice(),10);
        stockTest.testPrice ("Max",testCompany.getMaxPrice(),12);

        testCompany.updatePrice(5);
        stockTest.testPrice ("current",testCompany.getCurrentPrice(),5);
        stockTest.testPrice ("Min",testCompany.getMinPrice(),5);
        stockTest.testPrice ("Max",testCompany.getMaxPrice(),12);

        testCompany.updatePrice(7);
        stockTest.testPrice ("current",testCompany.getCurrentPrice(),7);
        stockTest.testPrice ("Min",testCompany.getMinPrice(),5);
        stockTest.testPrice ("Max",testCompany.getMaxPrice(),12);

        testCompany.updatePrice(99);
        stockTest.testPrice ("current",testCompany.getCurrentPrice(),99);
        stockTest.testPrice ("Min",testCompany.getMinPrice(),5);
        stockTest.testPrice ("Max",testCompany.getMaxPrice(),99);

        testCompany.updatePrice(77);
        stockTest.testPrice ("current",testCompany.getCurrentPrice(),77);
        stockTest.testPrice ("Min",testCompany.getMinPrice(),5);
        stockTest.testPrice ("Max",testCompany.getMaxPrice(),99);

        testCompany.updatePrice(999);
        testCompany.updatePrice(1);
        stockTest.testPrice ("current",testCompany.getCurrentPrice(),1);
        stockTest.testPrice ("Min",testCompany.getMinPrice(),1);
        stockTest.testPrice ("Max",testCompany.getMaxPrice(),999);

        testCompany.updatePrice(999);
        testCompany.updatePrice(2);
        testCompany.updatePrice(1000);
        testCompany.updatePrice(8);
        stockTest.testPrice ("current",testCompany.getCurrentPrice(),8);
        stockTest.testPrice ("Min",testCompany.getMinPrice(),1);
        stockTest.testPrice ("Max",testCompany.getMaxPrice(),1000);

    }
}
