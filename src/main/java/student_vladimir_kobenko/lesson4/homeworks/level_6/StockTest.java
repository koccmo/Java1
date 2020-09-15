package student_vladimir_kobenko.lesson4.homeworks.level_6;

public class StockTest {
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
