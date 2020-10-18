package student_dmitrijs_jasvins.lesson_11.day_5_approved;



class BookValidator {

    boolean isBookAuthor (Book book, String author) {
        return (book.getAuthor().equals(author));
    }

    boolean isBookTitle(Book book, String title) { return (book.getTitle().equals(title)); }
}
