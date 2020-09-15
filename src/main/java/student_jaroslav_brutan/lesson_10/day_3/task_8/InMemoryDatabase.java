package student_jaroslav_brutan.lesson_10.day_3.task_8;

import java.util.ArrayList;
import java.util.List;

class InMemoryDatabase implements Database{

    private List<Product> productsList = new ArrayList<>();
    List <Product> getProductsList(){
        return productsList;
    }

    @Override
    public void save(Product product){
        productsList.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : productsList){
            if (product.getTitle().equals(productTitle)){
                return product;
            }
        }
        return null;
    }


}
