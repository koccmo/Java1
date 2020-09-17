package student_jaroslav_brutan.lesson_10.day_3.task_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);

}


class Product {

    private String title;

    public Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}

// Этот интерфейс не является функциональным потому, что в нём два метода -> save, findByTitle.
