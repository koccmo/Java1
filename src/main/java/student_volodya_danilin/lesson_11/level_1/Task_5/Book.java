package student_volodya_danilin.lesson_11.level_1.Task_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Book {

    private String title;
    private String author;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }
}
