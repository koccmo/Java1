/*/
Разработку функциональности можно начать с создания доменной модели.
Доменная модель - это классы, которые описывают данные с которыми
будет работать компьютерная программа.

В нашем случае речь идёт о продукте.

Поэтому создаём класс Product:

class Product {

    // создайте нужные свойства класса
    // создайте конструктор класса
    // создайте get() set() методы
    // переопределите методы:
    //      equals()
    //      hashCode()
    //      toString()

}
 */
package student_igors_bartkevics.lesson_12.homework.level_6_middle_task_35_to_48;

import java.util.Objects;

class Product {

    // создайте нужные свойства класса
    private String title;
    private Integer price;
    private String description;

    // создайте конструктор класса
    public Product(String title, Integer price, String description) {
        this.title = title;
        this.price = price;
        this.description = description;
    }

    // создайте get() set() методы

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // переопределите методы:
    //      equals()
    //      hashCode()

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(title, product.title) &&
                Objects.equals(price, product.price) &&
                Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, description);
    }

    //      toString()
    @Override
    public String toString() {
        return "Product{" +
                "name='" + title + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
