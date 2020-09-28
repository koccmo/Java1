package student_eduards_jasvins.lesson_11.day_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = false)
class BookValidator {

    boolean isBookAuthor (Book book, String author) {
        return (book.getAuthor().equals(author));
    }

    boolean isBookTitle(Book book, String title) { return (book.getTitle().equals(title)); }
}
