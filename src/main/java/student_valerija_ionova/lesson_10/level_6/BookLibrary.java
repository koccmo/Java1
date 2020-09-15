package student_valerija_ionova.lesson_10.level_6;

import java.util.ArrayList;
import java.util.Arrays;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class BookLibrary {

    private ArrayList<Book> bookLibrary;

    BookLibrary (Book ... books){
        this.bookLibrary = new ArrayList <>(Arrays.asList(books));
    }

    ArrayList <Book> getBookLibrary(){
        return bookLibrary;
    }


}
