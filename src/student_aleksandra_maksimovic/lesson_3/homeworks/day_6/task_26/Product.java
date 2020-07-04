package student_aleksandra_maksimovic.lesson_3.homeworks.day_6.task_26;

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

import java.sql.SQLOutput;  // не оставляйте в коде не используемые импорты

public class Product {

    private String name;
    public double regularPrice;
    public int discount;

    public Product (String productName) {
        this.name = productName;
    }



    public double finalPrice() {
        return this.regularPrice - (this.regularPrice * this.discount / 100);
    }

    public void printInformation() {
        System.out.println(this.name + " - цена " + regularPrice + "$");
        System.out.println("скидка - " + discount + "%");
        System.out.println("конечная цена - " + finalPrice() + "$");
    }
}
