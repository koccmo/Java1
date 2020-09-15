
package student_jaroslav_brutan.lesson_10.day_6.task_14;


import java.util.ArrayList;
import java.util.List;

public class BookReaderImpl implements BookReader {

    private List<Book> library = new ArrayList<>();

    @Override
    public boolean addBook(Book checkBook){
        if (canAddBook(checkBook)){
            library.add(checkBook);
            return true;
        } else return false;
    }

    boolean canAddBook(Book checkBook){
        return (library.isEmpty() || ! bookAlreadyInLibrary(checkBook));
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


}


