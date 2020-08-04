package student_valerija_ionova.lesson_10.level_6;

import java.util.ArrayList;
import java.util.Arrays;

public class BookLibrary {

    ArrayList<Book> bookLibrary;

    BookLibrary (Book ... books){
        this.bookLibrary = new ArrayList <Book>(Arrays.asList(books));
    }

    ArrayList <Book> getBookLibrary(){
        return bookLibrary;
    }


}
