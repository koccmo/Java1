package student_pavel_sharkel.lesson_10.level_3.task_8;

interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);

}
