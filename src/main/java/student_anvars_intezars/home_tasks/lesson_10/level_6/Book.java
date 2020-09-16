package student_anvars_intezars.home_tasks.lesson_10.level_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Book {

    private String title;
    private String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    String getTitle() {
        return this.title;
    }

    String getAuthor() {
        return this.author;
    }

}
