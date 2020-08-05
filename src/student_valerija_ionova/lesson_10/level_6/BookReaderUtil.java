package student_valerija_ionova.lesson_10.level_6;

class BookReaderUtil {

    boolean titleMatchSomeLetters(String titleToFind, String titleInBook){       //Task 19
        return (titleInBook.startsWith(titleToFind));
    }

    boolean titleMatchFull(String titleToFind, String titleInBook){              //Task 20
        return titleInBook.equals(titleToFind);
    }

    boolean authorMatchSomeLetters(String authorToFind, String authorInBook){       //Task 19
        return (authorInBook.startsWith(authorToFind));
    }

    boolean authorMatchFull(String authorToFind, String authorInBook){              //Task 18
        return authorInBook.equals(authorToFind);
    }


    boolean isBookInLibrary (Book book, BookLibrary library){
        for (Book element : library.getBookLibrary()){
            if (element.equals(book)) {
                return true;
            }
        }
        return false;
    }

    boolean isCorrectBook (Book book){
        if ((book.getTitle() == null) || (book.getAuthor() == null)){
            return false;
        }else{
            return !((book.getTitle().length() == 0) || (book.getAuthor().length() == 0));
        }
    }

}
