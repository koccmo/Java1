package student_valerija_ionova.lesson_10.level_6;

import java.util.ArrayList;

class BookReaderImpl implements  BookReader{

    @Override
    public boolean addBook(Book book, BookLibrary library) {                //Task 14 & 15
        if (isBookInLibrary(book, library) || (!isCorrectBook(book))){
            return false;
        }else{
            library.getBookLibrary().add(book);
            return true;
        }
    }

    @Override
    public boolean deleteBook(Book book, BookLibrary library) {             //Task 16
        if (!isBookInLibrary(book, library)){
            return false;
        }else{
            library.getBookLibrary().remove(book);
            return true;
        }
    }

    @Override
    public String[][] getListOfBooks(BookLibrary library) {                    //Task 17

        return fromListOfBooksToArray(library, true);
    }

    private String [][] fromListOfBooksToArray(BookLibrary library, boolean status){
        String [][] result = new String [library.getBookLibrary().size()][2];
        for (int i = 0; i < result.length; i++){
            if (status) {
                result[i][0] = library.getBookLibrary().get(i).getTitle();
                result[i][1] = library.getBookLibrary().get(i).getAuthor();
            }
        }
        return result;
    }

    @Override
    public String[][] getListOfReadBooks(BookLibrary library) {
        String [][] result = new String [library.getBookLibrary().size()][2];
        int length = 0;
        for (int i = 0; i < result.length; i++){
            if (library.getBookLibrary().get(i).getIsRead()) {
                result[length][0] = library.getBookLibrary().get(i).getTitle();
                result[length][1] = library.getBookLibrary().get(i).getAuthor();
                length ++;
            }
        }
        String [][] newArray = new String [length][2];
        for (int i = 0; i < length; i++){
            newArray[i][0] = result[i][0];
            newArray[i][1] = result[i][1];
        }
        return newArray;
    }

    @Override
    public ArrayList<Book> findBookByAuthor(String author, BookLibrary library) {   //Task 18 & Task 19
        ArrayList <Book> result = new ArrayList <>();
        for (Book element : library.getBookLibrary()){
            if (authorMatchFull(author, element.getAuthor()) || authorMatchSomeLetters(author, element.getAuthor())){
                result.add(element);
            }
        }
        return result;
    }

    @Override
    public ArrayList<Book> findBookByTitle(String title, BookLibrary library) {     //Task 20 & Task21
        ArrayList <Book> result = new ArrayList <>();
        for (Book element : library.getBookLibrary()){
            if (titleMatchFull(title, element.getTitle()) || titleMatchSomeLetters(title, element.getTitle())){
                result.add(element);
            }
        }
        return result;
    }

    public boolean isRead (Book book, BookLibrary library, boolean isRead){
        if (isBookInLibrary(book, library)){
            for (Book element : library.getBookLibrary()){
                if (element.equals(book)){
                    element.setIsRead(isRead);
                }
            }
            return true;
        }else {
            return false;
        }
    }


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


    private boolean isBookInLibrary (Book book, BookLibrary library){
        for (Book element : library.getBookLibrary()){
            if (element.equals(book)) {
                return true;
            }
        }
        return false;
    }

    private boolean isCorrectBook (Book book){
        if ((book.getTitle() == null) || (book.getAuthor() == null)){
            return false;
        }else{
            return !((book.getTitle().length() == 0) || (book.getAuthor().length() == 0));
        }
    }



}
