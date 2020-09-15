package student_valerija_ionova.lesson_10.level_3.task_10;

import java.util.ArrayList;
import java.util.Optional;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
public class InMemoryDatabase implements  Database{

    private ArrayList <Product> products = new ArrayList<>();

    @CodeReviewComment(teacher = "Return type must be List<Product> ")
    ArrayList <Product> getProducts(){
        return products;
    }

    @Override
    public void save(Product product) {
          products.add(product);
    }

    @Override
    public Optional <Product> findByTitle(String productTitle) {
            for (Product product : products){
                if (product.getTitle().equals(productTitle)){
                    return Optional.of(product);
                }
            }
        return Optional.empty();
    }


}
