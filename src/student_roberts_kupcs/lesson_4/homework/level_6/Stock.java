package student_roberts_kupcs.lesson_4.homework.level_6;

class Stock {
    private String nameOfCompany;
    private double currentValue;
    private double minimumCost;
    private double maximumCost;

    //Методы:
    //- Обновить текущую стоимость акции updatePrice()
    //- Распечатать информацию об акции printInformation()
    //Имя компании и начальную стоимость необходимо
    //задавать в момент создания акции.
    //Текущая, минимальная и максимальная стоимость
    //должны меняться только через метод updatePrice().
    public Stock(String nameOfCompany, double currentValue) {
        this.nameOfCompany = nameOfCompany;
        this.currentValue = currentValue;
        this.maximumCost = currentValue;
        this.minimumCost = currentValue;
    }

    // в этом коде есть логическая ошибка
    public void updatePrice(double newPrice) {
        if (newPrice < this.minimumCost) {
            this.minimumCost = newPrice;
        } else if (newPrice > this.maximumCost) {
            this.maximumCost = newPrice;
        } else {
            this.currentValue = newPrice;
        }
    }

    public String printInformation() {
        return ("Company = " + nameOfCompany + ", Current value = " + currentValue + ", Minimum cost = " + minimumCost + ", Maximum cost = " + maximumCost);
    }

}
