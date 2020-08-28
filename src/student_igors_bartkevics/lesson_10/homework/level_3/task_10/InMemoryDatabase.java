package student_igors_bartkevics.lesson_10.homework.level_3.task_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class InMemoryDatabase implements Database {

    private List<Product> listOfProducts = new ArrayList<>();

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    @Override
    public void save(Product product) {
        listOfProducts.add(product);
    }

    @Override
    public Optional <Product> findByTitle(String productTitle) {
        Product result = null;
        for (Product product : listOfProducts) {
            if (product.getTitle().equals(productTitle)) {
                result = product;
                break;
            }
        }
        return Optional.ofNullable(result);
    }
}
