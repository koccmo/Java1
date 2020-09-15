package student_aleksandra_maksimovic.my_exercises.product;
/*
Разработать класс - продукт,
у которого должны быть следующие характеристики:

Свойства:
- Наименование (String name)
- Стандартная цена (double regularPrice)
- Скидка в процентах (double discount)

Методы:
1. Расчет актуальной стоимости с учетом скидки (double actualPrice())
Вывод информации о продукте в консоль (void printInformation())1P
2. Название продукта нужно задавать через конструктор, а стоимость и скидку через оператор ".".

Класс с объявлением продукта должен называться "Product".
Класс с демонстрацией работы должен называться "ProductDemo".
 */

public class Product {
    private String name;
    private  double regularPrice;
    private  double discount;

    public Product (String name ) {
        this.name = name;
    }

    public void setRegularPrice (double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount (double discount) {
        this.discount = discount;
    }

    public double actualPrice() {
        return regularPrice- (regularPrice * discount);
    }
    public void printInformation() {
        System.out.println("Product name = "+ name + " : Regular price : "+ regularPrice);
        System.out.println("discount : "+ discount);
        System.out.println("curent price : " + actualPrice());
    }

}
