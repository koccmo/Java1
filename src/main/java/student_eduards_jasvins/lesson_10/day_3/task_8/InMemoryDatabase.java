package student_eduards_jasvins.lesson_10.day_3.task_8;

import java.util.ArrayList;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
class InMemoryDatabase implements Database {

	@CodeReviewComment(teacher = "Use interface from left side instead of implementation.")
	@CodeReviewComment(teacher = "private List<Product> products = new ArrayList<>();")
    private ArrayList <Product> products = new ArrayList<>();

	@CodeReviewComment(teacher = "Should return interface List instead of ArrayList.")
    ArrayList <Product> getProducts()  { return products; }

    @Override
    public void save(Product product) { products.addAll(products); }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : products) {
            if (product.getTitle().equals(productTitle)) {
                return product;
            }
        }
        return null;
    }

}
