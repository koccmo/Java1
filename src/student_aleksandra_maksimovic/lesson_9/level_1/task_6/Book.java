package student_aleksandra_maksimovic.lesson_9.level_1.task_6;
/*
Исправьте код класса Book так, что бы он соответствовал принцыпу инкапсуляции.

class Book {

    String title;
    String author;

}
 */
class Book {
    private String title;
    private String author;

    Book ( String title, String author){
        this.title = title;
        this.author = author;
    }

    String getTitle(){
        return title;
    }
    String getAuthor(){
        return author;
    }
}
