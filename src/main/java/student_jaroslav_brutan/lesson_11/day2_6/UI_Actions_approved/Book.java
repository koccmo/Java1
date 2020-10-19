package student_jaroslav_brutan.lesson_11.day2_6.UI_Actions_approved;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Book {

    private Long id;
    private String title;
    private String author;
    private String yearOfIssue;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getYearOfIssue() {
        return yearOfIssue;
    }

}
