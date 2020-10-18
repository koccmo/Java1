package student_valerija_ionova.lesson_12.level_5_6_middle.task_27_48.refactoring_methods_not_more_than_3_strings;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price.equals(product.price) &&
                Objects.equals(title, product.title) &&
                Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, description);
    }

    @Override
    public String toString() {
        return "Product: title: " + title + ", price: " + price + ", description='" + description;
    }
}
