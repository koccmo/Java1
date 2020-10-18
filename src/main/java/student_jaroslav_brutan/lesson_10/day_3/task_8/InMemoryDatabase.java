package student_jaroslav_brutan.lesson_10.day_3.task_8;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class InMemoryDatabase implements Database{

    private List<Product> productsList = new ArrayList<>();

    @CodeReviewComment(teacher = "Why this method are needed?")
    // Updated
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
