package student_volodya_danilin.lesson_10.level_3.Task_8;

import java.util.ArrayList;
import java.util.List;

class InMemoryDatabase implements Database{

    List<Product> productList = new ArrayList<>();

    @Override
    public void save(Product ... product) {
        for (Product i : product) {
            this.productList.add(i);
        }
    }

    @Override
    public Product findByTitle(String productTitle) {
        Product result = null;
        for (Product value : productList) {
            if (value.getTitle().equals(productTitle)) {
                result = value;
            }
        }
        return result;
    }
}
