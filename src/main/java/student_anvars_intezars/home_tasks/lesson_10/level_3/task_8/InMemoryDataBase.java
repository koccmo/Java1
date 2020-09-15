package student_anvars_intezars.home_tasks.lesson_10.level_3.task_8;

import java.util.ArrayList;
import java.util.List;

class InMemoryDataBase implements Database {

    List<Product> products = new ArrayList<>();

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {
        String titleFromProducts = "";
        for (int i = 0; i < products.size(); i++) {
            titleFromProducts = products.get(i).getTitle();
            if (titleFromProducts.equals(productTitle)) {
                return products.get(i);
            }
        } return null;
    }
}
