
package student_jaroslav_brutan.lesson_10.day_6;


import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
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

    @Override
    public List<Book> findBookByTitle(String title){
        for (Book books : library) {
            if (books.getTitle().contains(title)){
                return findBookByTitle(title);
            }
        } return findBookByTitle(title);
    }

    @Override
    public boolean isRead(Book book){
        if (bookAlreadyInLibrary(book)){
            library.get(0).getIsRead();
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isNotRead(Book book){
        if (bookAlreadyInLibrary(book)){
            library.get(0).getIsRead();
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String[] allReadBooks(){
        String[] allReadBooks = new String[library.size()];
        for (int i = 0;i < library.size();i++){
            if (library.get(i).getIsRead()){
                allReadBooks[i] = library.get(i).getTitle() + "[" +
                        library.get(i).getAuthor() + "]";
            }
        } return allReadBooks;
    }

    @Override
    public String[] allNotReadBooks(){
        String[] allNotReadBooks = new String[library.size()];
        for (int i = 0;i < library.size();i++){
            if (!library.get(i).getIsRead()){
                allNotReadBooks[i] = library.get(i).getTitle() + "[" +
                        library.get(i).getAuthor() + "]";
            }
        } return allNotReadBooks;
    }
}


