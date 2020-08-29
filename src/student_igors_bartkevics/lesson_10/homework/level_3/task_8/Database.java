package student_igors_bartkevics.lesson_10.homework.level_3.task_8;

interface Database {
    void save(Product product);

    Product findByTitle(String productTitle);
}
