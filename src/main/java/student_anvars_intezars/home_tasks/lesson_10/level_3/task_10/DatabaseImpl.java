package student_anvars_intezars.home_tasks.lesson_10.level_3.task_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class DatabaseImpl implements Database {

    List<Product> products = new ArrayList<>();

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Optional<Product>findByTitle(String title) {
        for (int i = 0; i < products.size(); i++) {
            Product listProduct = products.get(i);
            if (listProduct.getTitle().equals(title)) {
                return Optional.of(listProduct);
            }
        } return Optional.empty();
    }
}


