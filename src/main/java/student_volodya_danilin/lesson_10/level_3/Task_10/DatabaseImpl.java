package student_volodya_danilin.lesson_10.level_3.Task_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DatabaseImpl implements Database {

    List<Product> productList = new ArrayList<>() {
    };

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
        for (Product product : productList) {
            if (product.getTitle().equals(productTitle)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }
}
