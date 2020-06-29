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
    public static void main(String[] args){
        Stock google = new Stock("GOOG", 10);

        //System.out.println(google.printInformation());
        //System.out.println("Company = \"GOOG\", Current Price = 10.0, " +
        //        "Min Price = 10.0, Max Price = 10.0");

        if (google.printInformation().equals("Company = \"GOOG\", Current Price = 10.0, " +
                "Min Price = 10.0, Max Price = 10.0")){
            System.out.println("Class Stock is working good");
        }else{
            System.out.println("Class Stock isn't working");
        }

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        //System.out.println(google.printInformation());
        //System.out.println("Company = \"GOOG\", Current Price = 14.0, " +
        //        "Min Price = 7.0, Max Price = 15.0");

        if (google.printInformation().equals("Company = \"GOOG\", Current Price = 14.0, " +
                "Min Price = 7.0, Max Price = 15.0")){
            System.out.println("Class Stock is working good");
        } else{
            System.out.println("Class Stock isn't working");
        }}
}
