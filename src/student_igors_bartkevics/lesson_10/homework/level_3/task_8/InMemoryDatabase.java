package student_igors_bartkevics.lesson_10.homework.level_3.task_8;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

import student_dmitrijs_jasvins.lesson_9.day_2.task_12.A;

import java.util.ArrayList;
import java.util.List;


@CodeReview(approved = true)
@CodeReviewComment(teacher = "Please delete unused import statements.")
class InMemoryDatabase implements Database{

    private List<Product> listOfProducts = new ArrayList<>();

    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    @Override
    public void save(Product product) {
        listOfProducts.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {
        Product result = null;
        for (Product product : listOfProducts) {
            if (product.getTitle().equals(productTitle)) {
                result =  product;
                break;
            }
        }
        return result;
    }
}
