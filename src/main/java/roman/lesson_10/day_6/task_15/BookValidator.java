package roman.lesson_10.day_6.task_15;

public class BookValidator {

    public boolean bookValidToBeAdded(Book bookToAdd, BookReaderImpl bookReader) {
        return (bookReader.getLibrary().isEmpty() || !checkBookInLibrary(bookReader, bookToAdd))
                    && bookIsFullyFilled(bookToAdd);
    }

    private boolean bookIsFullyFilled(Book bookToAdd) {
        return checkAuthor(bookToAdd) && checkTitle(bookToAdd);
    }

    private boolean checkTitle(Book bookToAdd) {
        return !bookToAdd.getTitle().equals("") && bookToAdd.getTitle() != null;
    }

    private boolean checkAuthor(Book bookToAdd) {
        return !bookToAdd.getAuthor().equals("") && bookToAdd.getAuthor() != null;
    }

    private boolean checkBookInLibrary(BookReaderImpl bookReader, Book bookToAdd) {
        boolean result = false;
        for(Book book : bookReader.getLibrary()) {
            if(book.getAuthor().equals(bookToAdd.getAuthor())
                    && book.getTitle().equals(bookToAdd.getTitle())) {
                result = true;
                break;
            }
        }
        return result;
    }
}
