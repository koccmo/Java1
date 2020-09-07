package student_igors_bartkevics.lesson_11.homework.level_5_middle.task_29;

class BookValidator {

    boolean isBookByAuthor(Book book, String author) {
        return (book.getAuthor().equals(author));
    }

    boolean isBookWithTitle(Book book, String title) {
        return (book.getTitle().equals(title));
    }
}
