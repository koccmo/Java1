package student_jaroslav_brutan.lesson_10.day_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Book {

    private String title;
    private String author;
    private boolean isRead;

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

    public boolean getIsRead() {
        return isRead;
    }

    public void setRead(boolean read){
        isRead = read;
    }
}
