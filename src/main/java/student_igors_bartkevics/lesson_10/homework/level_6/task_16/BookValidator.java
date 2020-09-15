package student_igors_bartkevics.lesson_10.homework.level_6.task_16;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BookValidator {

    boolean isBookValidToAddInReaderLibrary(Book bookToAdd, BookReaderImpl bookReader) {
        return (bookReader.getLibrary().isEmpty() || !isBookInReaderLibrary(bookToAdd, bookReader)) &&
                bookFieldsAreFilled(bookToAdd);
    }

    boolean isBookValidToRemoveItFromReaderLibrary(Book bookToRemove, BookReaderImpl bookReader) {
        return (isBookInReaderLibrary(bookToRemove, bookReader) && bookFieldsAreFilled(bookToRemove));
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

    private boolean isBookInReaderLibrary(Book bookToCheck, BookReaderImpl bookReader) {
        boolean result = false;

        for (Book book : bookReader.getLibrary()) {
            if (book.getAuthor().equals(bookToCheck.getAuthor()) &&
                    book.getTitle().equals(bookToCheck.getTitle())) {
                result = true;
                break;
            }
        }
        return result;
    }
}
