package student_valerija_ionova.lesson_4.level_6.task_17;

/*Написать тестовые сценарии для класса Stock в классе StockTest.

Пример работы с классом Stock:

Stock google = new Stock("GOOG", 10);
google.printInformation();
​
google.updatePrice(15);
google.updatePrice(7);
google.updatePrice(14);
​
google.printInformation();

Вывод в консоль:
Company = "GOOG", Current Price = 10, Min Price = 10, Max Price = 10
Company = "GOOG", Current Price = 14, Min Price = 7, Max Price = 15*/

public class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.testPrintInformationAfterCreation();
        stockTest.printInformationAfterPriceChanges();
        stockTest.newMinPrice();
        stockTest.newCurrentPrice();
    }

    public void checkString(String name, String methodsResult, String expectedResult){
        if (methodsResult.equals(expectedResult)){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    public void checkDouble(String name, double methodsResult, double expectedResult){
        if (methodsResult == expectedResult){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    public void testPrintInformationAfterCreation() {
        Stock google = new Stock("GOOG", 10);

        checkString("testPrintInformationAfterCreation", google.printInformation(), "Company = \"GOOG\", Current Price = 10.0, " +
                "Min Price = 10.0, Max Price = 10.0");
    }

    public void printInformationAfterPriceChanges(){
        Stock google = new Stock("GOOG", 10);
        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        checkString("printInformationAfterPriceChanges", google.printInformation(), "Company = \"GOOG\", Current Price = 14.0, " +
                "Min Price = 7.0, Max Price = 15.0");
    }

    public void newMinPrice(){
        Stock rimi = new Stock("RIMI", 12);
        rimi.updatePrice(5);
        checkDouble("newMinPrice", rimi.getMinPrice(), 5);
    }

    public void newCurrentPrice(){
        Stock maxima = new Stock("MAXIMA", 18);
        maxima.updatePrice(10);
        checkDouble("newCurrentPrice", maxima.getCurrentPrice(), 10);
    }

    public void newMaxPrice(){
        Stock shop = new Stock("Buga", 18);
        shop.updatePrice(88);
        checkDouble("newMaxPrice", shop.getMaxPrice(), 88);
    }


}
