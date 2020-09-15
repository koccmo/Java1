
package student_jaroslav_brutan.lesson_10.day_6;


import java.util.ArrayList;
import java.util.List;

public class BookReaderImpl implements BookReader {

    private List<Book> library = new ArrayList<>();

    @Override
    public boolean addBook(Book checkBook){
       if (bookAlreadyInLibrary(checkBook) || noBookTitle(checkBook) || noBookAuthor(checkBook)){
           return false;
       } else {
           library.add(checkBook);
           return true;
       }
    }

    boolean bookAlreadyInLibrary (Book checkBook){
        boolean result = false;
        for (Book book : library){
            if (book.getAuthor().equals(checkBook.getAuthor()) && book.getTitle().equals(checkBook.getTitle())){
                result = true;
                break;
            }
        } return result;
    }

    boolean noBookTitle(Book book){
        return (book.getTitle().isBlank());
    }

    boolean noBookAuthor(Book book){
        return (book.getAuthor().isBlank());
    }

    @Override
    public boolean deleteBook(Book book){
        if (bookAlreadyInLibrary(book)){
            return false;
        } else {
            library.remove(book);
            return true;
        }
    }

    @Override
    public String[] allLibraryBooks(){
        String[] allBooks = new String[allLibraryBooks().length];
        for (int i = 0; i < allLibraryBooks().length; i++){
            allBooks[i] = library.get(i).getTitle() + "[" + library.get(i).getAuthor() + "]";
        } return allBooks;

    }

    @Override
    public List<Book> findBookByAuthor(String author){
        for (Book books : library) {
            if (books.getAuthor().contains(author)){
                return findBookByAuthor(author);
            }
        }   return findBookByAuthor(author);
    }
}


