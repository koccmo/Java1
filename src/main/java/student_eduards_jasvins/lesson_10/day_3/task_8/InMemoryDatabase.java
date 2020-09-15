package student_eduards_jasvins.lesson_10.day_3.task_8;

import java.util.ArrayList;

class InMemoryDatabase implements Database {

    private ArrayList <Product> products = new ArrayList<>();

    ArrayList <Product> getProducts()  { return products; }

    @Override
    public void save(Product product) { products.addAll(products); }

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
