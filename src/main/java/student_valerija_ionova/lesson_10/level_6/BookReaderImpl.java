package student_valerija_ionova.lesson_10.level_6;

import java.util.ArrayList;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BookReaderImpl implements  BookReader{

    BookReaderUtil bookReaderUtil = new BookReaderUtil();

    @Override
    public boolean addBook(Book book, BookLibrary library) {                //Task 14 & 15
        if (bookReaderUtil.isBookInLibrary(book, library) || (!bookReaderUtil.isCorrectBook(book))){
            return false;
        }else{
            library.getBookLibrary().add(book);
            return true;
        }
    }

    @Override
    public boolean deleteBook(Book book, BookLibrary library) {             //Task 16
        if (!bookReaderUtil.isBookInLibrary(book, library)){
            return false;
        }else{
            library.getBookLibrary().remove(book);
            return true;
        }
    }

    @Override
    public String[][] getListOfBooks(BookLibrary library) {                   //Task 17
        return fromListOfBooksToArray(library);
    }

    private String [][] fromListOfBooksToArray(BookLibrary library){
        String [][] result = new String [library.getBookLibrary().size()][2];
        for (int i = 0; i < result.length; i++){
                result[i][0] = library.getBookLibrary().get(i).getTitle();
                result[i][1] = library.getBookLibrary().get(i).getAuthor();
        }
        return result;
    }

    @Override
    public String[][] getListOfReadBooks(BookLibrary library) {
        return getListOfReadOrNotReadBooks(library, true);
    } //Task24

    @Override
    public String[][] getListOfNotReadBooks(BookLibrary library) {
        return getListOfReadOrNotReadBooks(library, false);
    }//Task 25

    String [][] getListOfReadOrNotReadBooks(BookLibrary library, boolean status){
        String [][] result = new String [library.getBookLibrary().size()][2];
        int length = 0;
        for (int i = 0; i < result.length; i++){
            if (library.getBookLibrary().get(i).getIsRead() == status) {
                result[length][0] = library.getBookLibrary().get(i).getTitle();
                result[length][1] = library.getBookLibrary().get(i).getAuthor();
                length ++;
            }
        }
        return getArrayOfRightLength(length, result);
    }

    String [][] getArrayOfRightLength(int length, String [][] result){
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
            if (bookReaderUtil.authorMatchFull(author, element.getAuthor()) ||
                    bookReaderUtil.authorMatchSomeLetters(author, element.getAuthor())){
                result.add(element);
            }
        }
        return result;
    }

    @Override
    public ArrayList<Book> findBookByTitle(String title, BookLibrary library) {     //Task 20 & Task21
        ArrayList <Book> result = new ArrayList <>();
        for (Book element : library.getBookLibrary()){
            if (bookReaderUtil.titleMatchFull(title, element.getTitle()) ||
                    bookReaderUtil.titleMatchSomeLetters(title, element.getTitle())){
                result.add(element);
            }
        }
        return result;
    }

    public boolean isRead (Book book, BookLibrary library, boolean isRead){     //Task23
        if (bookReaderUtil.isBookInLibrary(book, library)){
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
}