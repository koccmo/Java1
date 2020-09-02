package student_igors_bartkevics.lesson_10.homework.level_6.task_21;

class BookValidator {

    boolean isBookValidToAddInReaderLibrary(Book bookToAdd, BookReaderImpl bookReader) {
        return (bookReader.isLibraryEmpty() || !bookReader.isBookInReaderLibrary(bookToAdd)) &&
                bookFieldsAreFilled(bookToAdd);
    }

    boolean isBookValidToRemoveItFromReaderLibrary(Book bookToRemove, BookReaderImpl bookReader) {
        return (bookReader.isBookInReaderLibrary(bookToRemove) && bookFieldsAreFilled(bookToRemove));
    }

    boolean isBookByAuthor(Book book, String author) {
        return (book.getAuthor().equals(author));
    }

    boolean isBookWithTitle(Book book, String title) {
        return (book.getTitle().equals(title));
    }

    boolean areLettersMatchingBookFieldValue(String letters, String fieldValue) {
        if ((letters.length() < fieldValue.length()) && letters.length() > 0) {
            String substring = fieldValue.substring(0, letters.length());
            return letters.equals(substring);
        }
        else {
            return false;
        }
    }

    private boolean bookFieldsAreFilled(Book book) {
        return isBookTitleFieldFilled(book) && isBookAuthorFieldFilled(book);
    }

    private boolean isBookTitleFieldFilled(Book book) {
        return !book.getTitle().equals("") && book.getTitle() != null;
    }

    private boolean isBookAuthorFieldFilled(Book book) {
        return !book.getAuthor().equals("") && book.getAuthor() != null;
    }
}
