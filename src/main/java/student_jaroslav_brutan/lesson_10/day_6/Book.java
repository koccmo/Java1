package student_jaroslav_brutan.lesson_10.day_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Book {

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
