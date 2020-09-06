package student_igors_bartkevics.lesson_11.homework.level_4_junior.task_25;

class BookValidator {

    boolean isBookByAuthor(Book book, String author) {
        return (book.getAuthor().equals(author));
    }

    boolean isBookWithTitle(Book book, String title) {
        return (book.getTitle().equals(title));
    }
}
