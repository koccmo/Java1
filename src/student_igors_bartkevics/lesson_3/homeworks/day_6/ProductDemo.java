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

package student_igors_bartkevics.lesson_3.homeworks.day_6;

class ProductDemo {

    public static void main(String[] args) {

        Product product = new Product("Samsung S20");
        product.regularPrice = 800.00;
        product.discount = 0.053;
        product.actualPrice();
        product.printInformation();
    }

}
