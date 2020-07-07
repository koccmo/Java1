package student_anvars_intezars.home_tasks.lesson_4.level_6;

public class Stock {

    private String name;
    private int currentPrice;
    private int maxPrice;
    private int minPrice;


    public Stock(String name, int currentPrice) {
        this.currentPrice = currentPrice;
        this.maxPrice = currentPrice;
        this.minPrice = currentPrice;
    }
        // Теперь создадим метод, который задаст новую цену и определит все ценовые категории
     public void updatePrice(int newPrice) {
            currentPrice = newPrice;

            // Сравниваем новую цену с максимальной и минимальной, чтобы определить их новые значения
     if (newPrice > maxPrice) {
                maxPrice = newPrice;
     }
     if (newPrice < minPrice) {
                minPrice = newPrice;
     }
    }
        //Теперь создадим геттеры для каждой категории цен, чтобы сравнить их значение в тесте
        //после использования метода обновления цены
     public int getMaxPrice(){
         return maxPrice;
     }
     public int getMinPrice(){
         return minPrice;
     }
     public int getCurrentPrice(){
        return currentPrice;
     }

     public void printInformation() {
        System.out.println("Company " + name + " Current price = " + currentPrice + ",");
        System.out.println("Min price = " + minPrice);
        System.out.println("Maximum price = " + maxPrice);
    }

}
