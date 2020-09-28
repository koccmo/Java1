package student_valerija_ionova.lesson_12.level_5_6_middle.task_27_48;

//Task 27 & 28
//- название
//- цену
//- описание

import java.util.Objects;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Product {

    private String title;
    private Integer price;
    private String description;

    Product (String title, Integer price, String description){
        this.title = title;
        this.price = price;
        this.description = description;
    }

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

    public boolean isTitleNull(){
        return title == null;
    }

    public boolean isPriceNull(){
        return price == null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(price, product.price) &&
                Objects.equals(title, product.title) &&
                Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, description);
    }

    @Override
    public String toString() {
        return "Product :\n" +
                "title: '" + title + '\'' +
                ", price: " + price +
                ", description='" + description + '\'';
    }


    // создайте нужные свойства класса
    // создайте конструктор класса
    // создайте get() set() методы
    // переопределите методы:
    //      equals()
    //      hashCode()
    //      toString()

}