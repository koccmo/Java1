package student_roberts_kupcs.lesson_10.level_3.Task_8;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class InMemoryDatabase implements Database {

    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {

        for (Product product : products) {
            if (product.getTitle().equals(productTitle)) {
                return product;
            }

        }
        return null;
    }
}
