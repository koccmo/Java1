package student_roberts_kupcs.lesson_12.homework.level_5_6;

import java.util.Objects;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
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
                "title='" + title + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
