package student_jaroslav_brutan.lesson_10.day_3.task_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


class InMemoryDatabase implements Database{

    private List <Product> productList = new ArrayList<>();

    public List<Product> getProductList(){
        return productList;
    }

    @Override
    public void save(Product product){
        productList.add(product);
    }

    @Override
    public Optional <Product> findByTitle(String productTitle){
        Product result = null;
        for (Product product : productList){
            if (product.getTitle().equals(productTitle)){
                result = product;
                break;
            }
        } return Optional.ofNullable(result);
    }


}

