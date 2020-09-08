package student_eduards_jasvins.lesson_10.day_3.task_8;

interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);
}
