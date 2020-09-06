package student_volodya_danilin.lesson_10.level_3.Task_8;

interface Database {

    void save(Product ... product);

    Product findByTitle(String productTitle);

}
