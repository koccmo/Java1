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

class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.testGetInformationAfterCreation();
        stockTest.getInformationAfterPriceChanges();

    }

    public void checkString(String name, String methodsResult, String expectedResult){
        if (methodsResult.equals(expectedResult)){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    public void testGetInformationAfterCreation() {
        Stock google = new Stock("GOOG", 10);

        checkString("Test GetInformation after creation", google.getInformation(), "Company = \"GOOG\", Current Price = 10.0, " +
                "Min Price = 10.0, Max Price = 10.0");
    }

    public void getInformationAfterPriceChanges(){
        Stock google = new Stock("GOOG", 10);
        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        checkString("Test getInformation after price changes", google.getInformation(), "Company = \"GOOG\", Current Price = 14.0, " +
                "Min Price = 7.0, Max Price = 15.0");
    }


}
