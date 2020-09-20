package student_pavel_sharkel.lesson_10.level_3.task_8;

import java.util.ArrayList;

public class InMemoryDatabase implements Database{

    ArrayList<Product> productList = new ArrayList<>();

    @Override
    public void save(Product product) {
      productList.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : productList) {
            if (product.getTitle().equals(productTitle)) {
                return product;
            }
        }
        return null;
    }
}
